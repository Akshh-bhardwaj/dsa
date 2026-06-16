package JavaInternals;

import java.util.ArrayList;
import java.util.List;

public class JVMAndStringDemo {

    public static void runStringPoolDemo() {
        System.out.println("\n--- 1. String Pool & Reference Equality Demo ---");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = s3.intern(); // Get the reference from constant pool

        System.out.println("s1 == s2 (literal == literal): " + (s1 == s2)); // true
        System.out.println("s1 == s3 (literal == new String): " + (s1 == s3)); // false
        System.out.println("s1 == s4 (literal == interned): " + (s1 == s4)); // true
        System.out.println("s1.equals(s3) (value comparison): " + s1.equals(s3)); // true
    }

    public static void runStringBenchmark() {
        System.out.println("\n--- 2. String vs StringBuilder Benchmark (100k iterations) ---");
        
        // String Concatenation
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for String (+) concat: " + (endTime - startTime) + " ms");

        // StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append("a");
        }
        String result = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for StringBuilder append: " + (endTime - startTime) + " ms");
    }

    public static void runAutoboxingTrap() {
        System.out.println("\n--- 3. Autoboxing & Integer Cache Trap ---");
        Integer a = 100;
        Integer b = 100;
        System.out.println("100 == 100 (Cached range): " + (a == b)); // true (IntegerCache caches -128 to 127)

        Integer c = 200;
        Integer d = 200;
        System.out.println("200 == 200 (Outside Cache): " + (c == d)); // false
        System.out.println("c.equals(d) (Value comparison): " + c.equals(d)); // true
    }

    public static void triggerStackOverflow(int count) {
        // Recursive call without base case to force StackOverflowError
        triggerStackOverflow(count + 1);
    }

    public static void triggerHeapOOM() {
        List<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[100_000_000]); // Consume heap memory rapidly
        }
    }

    public static void main(String[] args) {
        runStringPoolDemo();
        runStringBenchmark();
        runAutoboxingTrap();

        System.out.println("\nTo demonstrate JVM memory errors, you can manually run:");
        System.out.println("- triggerStackOverflow(0); -> Throws StackOverflowError");
        System.out.println("- triggerHeapOOM();        -> Throws OutOfMemoryError: Java heap space");
    }
}
