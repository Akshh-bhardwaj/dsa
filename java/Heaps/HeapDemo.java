package Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class HeapDemo {

    /**
     * A basic Min-Heap implementation from scratch to explain siftUp, siftDown,
     * and O(N) heap construction.
     */
    public static class CustomMinHeap {
        private List<Integer> heap = new ArrayList<>();

        public void insert(int val) {
            heap.add(val);
            siftUp(heap.size() - 1);
        }

        public int removeMin() {
            if (heap.isEmpty()) throw new IllegalStateException("Heap is empty");
            int min = heap.get(0);
            int last = heap.remove(heap.size() - 1);
            if (!heap.isEmpty()) {
                heap.set(0, last);
                siftDown(0);
            }
            return min;
        }

        private void siftUp(int idx) {
            while (idx > 0) {
                int parent = (idx - 1) / 2;
                if (heap.get(idx) >= heap.get(parent)) break;
                swap(idx, parent);
                idx = parent;
            }
        }

        private void siftDown(int idx) {
            int size = heap.size();
            while (2 * idx + 1 < size) {
                int left = 2 * idx + 1;
                int right = 2 * idx + 2;
                int smallest = left;

                if (right < size && heap.get(right) < heap.get(left)) {
                    smallest = right;
                }
                if (heap.get(idx) <= heap.get(smallest)) break;
                swap(idx, smallest);
                idx = smallest;
            }
        }

        private void swap(int i, int j) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }

        public void printHeap() {
            System.out.println(heap);
        }
    }

    /**
     * Solves Top K Frequent Elements using built-in PriorityQueue.
     * Time Complexity: O(N log K), Space Complexity: O(N)
     */
    public static int[] topKFrequent(int[] nums, int k) {
        // 1. Build frequency map
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Keep k top frequent elements in a Min-Heap
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> count.get(n1) - count.get(n2)
        );

        for (int num : count.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // 3. Convert heap to array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Custom Min-Heap Demonstration ---");
        CustomMinHeap myHeap = new CustomMinHeap();
        myHeap.insert(25);
        myHeap.insert(10);
        myHeap.insert(15);
        myHeap.insert(5);
        myHeap.insert(30);

        System.out.print("Heap internal list representation: ");
        myHeap.printHeap(); // Element '5' will be at the root (index 0)

        System.out.println("Removed Min: " + myHeap.removeMin()); // 5
        System.out.print("Heap after removal: ");
        myHeap.printHeap();

        System.out.println("\n--- 2. Top-K Frequent Elements demonstration ---");
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4};
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out.print("Top " + k + " frequent elements in " + java.util.Arrays.toString(nums) + ": ");
        System.out.println(java.util.Arrays.toString(topK)); // [1, 4] or [4, 1]
    }
}
