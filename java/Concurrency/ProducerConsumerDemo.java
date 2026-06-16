package Concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerDemo {

    public static void runProducerConsumer() throws InterruptedException {
        System.out.println("--- 1. Producer-Consumer using BlockingQueue ---");
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("[Producer] Producing item " + i);
                    queue.put(i); // blocks if queue is full
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Integer item = queue.take(); // blocks if queue is empty
                    System.out.println("[Consumer] Consumed item " + item);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }

    public static void runDeadlockDemo() {
        System.out.println("\n--- 2. Deadlock Demonstration & Fix ---");
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        // Thread A locks lock1 then lock2
        Thread threadA = new Thread(() -> {
            lock1.lock();
            System.out.println("[Thread A] Acquired Lock 1, waiting for Lock 2...");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            lock2.lock();
            System.out.println("[Thread A] Acquired both locks!");
            lock2.unlock();
            lock1.unlock();
        });

        // Thread B locks lock2 then lock1 (Potential Deadlock!)
        // Fix: Force same locking order (lock1 -> lock2)
        Thread threadB = new Thread(() -> {
            // Deadlock order: lock2.lock() -> lock1.lock()
            // Fix order: lock1.lock() -> lock2.lock()
            lock1.lock(); 
            System.out.println("[Thread B] Acquired Lock 1 (Fix ordered), waiting for Lock 2...");
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            lock2.lock();
            System.out.println("[Thread B] Acquired both locks!");
            lock2.unlock();
            lock1.unlock();
        });

        threadA.start();
        threadB.start();
    }

    public static void main(String[] args) throws InterruptedException {
        runProducerConsumer();
        
        // Run Deadlock demonstration (using fixed ordered locks to complete successfully)
        runDeadlockDemo();
    }
}
