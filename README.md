# DSA (Data Structures & Algorithms) 🚀

A curated repository of classic Data Structures and Algorithms implemented side-by-side in **C** and **Java**.

This project serves as an educational reference, highlighting the difference between a low-level programming paradigm (C: pointers, structs, manual memory allocation) and a high-level object-oriented paradigm (Java: generic classes, JVM garbage collection, package namespaces).

---

## 📂 Repository Structure

The project is split into two main sections:
- `c/`: Standard C implementations using structs and pointer arithmetic.
- `java/`: Idiomatic Java implementations grouped by week/topic matching the **Java DSA Course Plan** (26-Day Program).

```
dsa/
├── c/                         # C Implementations
│   ├── Arrays/                # Reverse array, Two Sum, Min/Max, Move Zeroes, Prefix Sum
│   ├── LinkedList/            # Singly Linked List, BST Menu (doubly_linked_list.c), Reverse List
│   ├── Searching/             # Linear and Binary Search
│   ├── Sorting/               # Bubble, Insertion, Quick, and Merge Sort
│   └── Stack/                 # Array Stack, List Stack, Infix to Postfix, Valid Parentheses Stack
└── java/                      # Java Implementations
    ├── JavaInternals/         # JVM Stack/Heap, String Constant Pool, Autoboxing
    ├── OOP/                   # SOLID Principles, Payroll Design
    ├── Collections/           # Generics, PECS Stack, HashMap collisions & treeification
    ├── Streams/               # Stream pipelines, Collectors mapping, Parallel Benchmarks
    ├── Concurrency/           # Producer-Consumer, Deadlocks, Thread-safe LRU Cache
    ├── Arrays/                # Two Sum, Reverse, Move Zeroes, Prefix Sum
    ├── LinkedList/            # Insert/Delete, Doubly/Singly Lists, Reversal
    ├── Searching/             # Linear & Binary Search
    ├── Sorting/               # Bubble, Insertion, Merge, Quick Sort
    ├── Stack/                 # Array Stack, List Stack, Infix to Postfix
    ├── Trees/                 # Pre/In/Post/BFS traversals, BST validation & delete
    ├── Heaps/                 # Custom Min-Heap, buildHeap, PriorityQueue Top-K
    ├── Tries/                 # Trie Prefix Tree (insert, search, startsWith)
    ├── Backtracking/          # Subsets generation, N-Queens solver
    ├── Graphs/                # Graph representations, BFS/DFS search, Dijkstra
    └── DynamicProgramming/    # Knapsack 0/1, LCS, Coin Change
```

---

## 📚 Topics Covered (C vs Java Map)

| Topic | C Path | Java Path | Key Concepts Covered |
| :--- | :--- | :--- | :--- |
| **Java Internals** | - | [java/JavaInternals/](file:///Users/akshit/Desktop/CODE/dsa/java/JavaInternals) | JVM memory model, String Pool behavior, Heap OOM, StackOverflow |
| **OOP & SOLID** | - | [java/OOP/](file:///Users/akshit/Desktop/CODE/dsa/java/OOP) | Polymorphism, SOLID principles, Dynamic dispatch |
| **Collections & Generics** | - | [java/Collections/](file:///Users/akshit/Desktop/CODE/dsa/java/Collections) | Custom Generic Stack (PECS), HashMap collision & treeification |
| **Streams & Lambdas** | - | [java/Streams/](file:///Users/akshit/Desktop/CODE/dsa/java/Streams) | Stream pipelines, Parallel streams benchmarking |
| **Concurrency** | - | [java/Concurrency/](file:///Users/akshit/Desktop/CODE/dsa/java/Concurrency) | BlockingQueue Producer-Consumer, Deadlocks, Thread-safe LRU |
| **Arrays** | [c/Arrays/](file:///Users/akshit/Desktop/CODE/dsa/c/Arrays) | [java/Arrays/](file:///Users/akshit/Desktop/CODE/dsa/java/Arrays) | Reverse Array, Min/Max element, Two Sum, Move Zeroes, Prefix Sum |
| **Linked List** | [c/LinkedList/](file:///Users/akshit/Desktop/CODE/dsa/c/LinkedList) | [java/LinkedList/](file:///Users/akshit/Desktop/CODE/dsa/java/LinkedList) | Insertion/deletion, List Reversal, BST Node conversion |
| **Searching** | [c/Searching/](file:///Users/akshit/Desktop/CODE/dsa/c/Searching) | [java/Searching/](file:///Users/akshit/Desktop/CODE/dsa/java/Searching) | Linear Search (O(N)), Binary Search (O(log N)) |
| **Sorting** | [c/Sorting/](file:///Users/akshit/Desktop/CODE/dsa/c/Sorting) | [java/Sorting/](file:///Users/akshit/Desktop/CODE/dsa/java/Sorting) | Bubble, Insertion, Quick, and Merge Sort |
| **Stack & Queue** | [c/Stack/](file:///Users/akshit/Desktop/CODE/dsa/c/Stack) | [java/Stack/](file:///Users/akshit/Desktop/CODE/dsa/java/Stack) | Array & List Stacks, Infix to Postfix, Valid Parentheses |
| **Trees & BST** | [c/Trees/](file:///Users/akshit/Desktop/CODE/dsa/c/Trees) | [java/Trees/](file:///Users/akshit/Desktop/CODE/dsa/java/Trees) | DFS/BFS traversals, BST Insertion/Deletion, Validation, Kth Smallest |
| **Heaps** | [c/Heaps/](file:///Users/akshit/Desktop/CODE/dsa/c/Heaps) | [java/Heaps/](file:///Users/akshit/Desktop/CODE/dsa/java/Heaps) | Custom Min-Heap, O(N) buildHeap, PriorityQueue Top-K Frequent |
| **Tries** | [c/Tries/](file:///Users/akshit/Desktop/CODE/dsa/c/Tries) | [java/Tries/](file:///Users/akshit/Desktop/CODE/dsa/java/Tries) | Prefix Tree implementation (insert, search, startsWith) |
| **Backtracking** | [c/Backtracking/](file:///Users/akshit/Desktop/CODE/dsa/c/Backtracking) | [java/Backtracking/](file:///Users/akshit/Desktop/CODE/dsa/java/Backtracking) | Subsets generation, Permutations, N-Queens solver |
| **Graphs** | [c/Graphs/](file:///Users/akshit/Desktop/CODE/dsa/c/Graphs) | [java/Graphs/](file:///Users/akshit/Desktop/CODE/dsa/java/Graphs) | Representation (List/Matrix), BFS/DFS, Dijkstra's Shortest Path |
| **DP** | [c/DynamicProgramming/](file:///Users/akshit/Desktop/CODE/dsa/c/DynamicProgramming) | [java/DynamicProgramming/](file:///Users/akshit/Desktop/CODE/dsa/java/DynamicProgramming) | Knapsack 0/1 (space optimized), Coin Change, LCS |

---

## 🛠️ How to Compile and Run

### Running C Code
Compile using standard `gcc` (or `clang`) and execute:
```bash
# Example: Bubble Sort
cd c/Sorting
gcc bubble_sort.c -o bubble_sort
./bubble_sort
```

### Running Java Code
Compile the package structure from the `java/` root directory and execute:
```bash
# Example: HashMap Collision Demo
cd java
javac Collections/HashMapCollisionDemo.java
java Collections.HashMapCollisionDemo
```
*(Alternatively, starting from Java 11+, you can execute single-file source codes directly without manual compilation step:* `java Collections/HashMapCollisionDemo.java`*)*

---

## 🎓 Teaching Tips (Comparing C vs Java)

When teaching or demonstrating these algorithms:
1. **Memory Allocation**: Compare C's `malloc()` and `free()` to Java's `new` keyword and JVM Garbage Collection.
2. **References & Pointers**: Notice how C uses double pointers `struct Node** head_ref` to modify references, whereas Java passes object references by value (requiring wrapping class fields or returning updated nodes).
3. **Data Type Representation**: Emphasize how Java strings and arrays contain built-in length attributes (`arr.length`), whereas C functions require passing size parameters (`int size`).

---

## 📈 Profiles & Contributions

- **GitHub Profile**: [Akshh-bhardwaj](https://github.com/Akshh-bhardwaj)
- **Contributions**: Contributions, bug fixes, or new implementations are welcome! Feel free to open a Pull Request.

> "Consistency is the key to mastery." 🔑
