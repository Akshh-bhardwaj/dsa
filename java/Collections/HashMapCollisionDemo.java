package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollisionDemo {

    /**
     * A class designed to force collisions in a HashMap by returning a constant hashCode.
     */
    private static class CollidingKey {
        private String value;

        CollidingKey(String value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            // Force hash collision - all instances land in the exact same HashMap bucket
            return 42;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CollidingKey other = (CollidingKey) obj;
            return value.equals(other.value);
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public static void main(String[] args) {
        Map<CollidingKey, String> map = new HashMap<>();

        System.out.println("Inserting elements with identical hashCodes to force collisions...");
        
        // These will all go into bucket '42'
        map.put(new CollidingKey("Key1"), "Value 1");
        map.put(new CollidingKey("Key2"), "Value 2");
        map.put(new CollidingKey("Key3"), "Value 3");
        
        System.out.println("Size of map: " + map.size()); // 3
        System.out.println("Value of Key2: " + map.get(new CollidingKey("Key2"))); // "Value 2"

        /*
         * Note on Treeification:
         * In Java 8+, if a single bucket gets more than 8 elements (TREEIFY_THRESHOLD)
         * and the map's capacity is at least 64, the bin is converted from a LinkedList
         * of Node to a Red-Black Tree of TreeNode. This optimizes the worst-case lookup
         * complexity from O(N) to O(log N).
         */
        System.out.println("\nInserting 10 elements to trigger bucket treeification...");
        for (int i = 0; i < 10; i++) {
            map.put(new CollidingKey("Key_" + i), "Val_" + i);
        }
        System.out.println("Successfully inserted colliding keys. Map resolves calls via tree search!");
    }
}
