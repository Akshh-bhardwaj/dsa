package Concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Thread-Safe O(1) Least Recently Used (LRU) Cache implementation.
 */
public class ThreadSafeLRUCache<K, V> {

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final ConcurrentHashMap<K, Node<K, V>> map;
    private Node<K, V> head;
    private Node<K, V> tail;
    
    // ReadWriteLock to allow multiple concurrent readers but exclusive writers
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public ThreadSafeLRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new ConcurrentHashMap<>();
    }

    public V get(K key) {
        rwLock.writeLock().lock(); // Node movement modifies links, so write lock is required
        try {
            Node<K, V> node = map.get(key);
            if (node == null) {
                return null;
            }
            moveToHead(node);
            return node.value;
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public void put(K key, V value) {
        rwLock.writeLock().lock();
        try {
            Node<K, V> node = map.get(key);
            if (node != null) {
                node.value = value;
                moveToHead(node);
            } else {
                Node<K, V> newNode = new Node<>(key, value);
                if (map.size() >= capacity) {
                    // Evict tail
                    map.remove(tail.key);
                    removeNode(tail);
                }
                addFirst(newNode);
                map.put(key, newNode);
            }
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    private void addFirst(Node<K, V> node) {
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = node;
        }
    }

    private void removeNode(Node<K, V> node) {
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
    }

    private void moveToHead(Node<K, V> node) {
        removeNode(node);
        addFirst(node);
    }

    public int size() {
        rwLock.readLock().lock();
        try {
            return map.size();
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public static void main(String[] args) {
        ThreadSafeLRUCache<Integer, String> cache = new ThreadSafeLRUCache<>(3);

        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");

        System.out.println("Get(2): " + cache.get(2)); // "Two" (making it recently used)

        cache.put(4, "Four"); // evicts key 1 (least recently used)

        System.out.println("Get(1): " + cache.get(1)); // null
        System.out.println("Get(3): " + cache.get(3)); // "Three"
        System.out.println("Get(4): " + cache.get(4)); // "Four"
    }
}
