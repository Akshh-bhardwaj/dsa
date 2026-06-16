# DSA (Data Structures & Algorithms) 🚀

A curated repository of classic Data Structures and Algorithms implemented side-by-side in **C** and **Java**.

This project serves as an educational reference, highlighting the difference between a low-level programming paradigm (C: pointers, structs, manual memory allocation) and a high-level object-oriented paradigm (Java: generic classes, JVM garbage collection, package namespaces).

---

## 📂 Repository Structure

The project is split into two main sections:
- `c/`: Standard C implementations using structs and pointer arithmetic.
- `java/`: Idiomatic Java implementations grouped in package directories.

```
dsa/
├── c/                         # C Implementations
│   ├── Arrays/                # Reverse array, Two Sum, Min/Max, Move Zeroes, Prefix Sum
│   ├── LinkedList/            # Singly Linked List, BST Menu (doubly_linked_list.c), Reverse List
│   ├── Searching/             # Linear and Binary Search
│   ├── Sorting/               # Bubble, Insertion, Quick, and Merge Sort
│   └── Stack/                 # Array Stack, List Stack, Infix to Postfix, Valid Parentheses Stack
└── java/                      # Java Implementations
    ├── Arrays/                # Packaged under `Arrays.*`
    ├── LinkedList/            # Packaged under `LinkedList.*`
    ├── Searching/             # Packaged under `Searching.*`
    ├── Sorting/               # Packaged under `Sorting.*`
    └── Stack/                 # Packaged under `Stack.*`
```

---

## 📚 Topics Covered (C vs Java Map)

| Topic | C Path | Java Path | Key Concepts Covered |
| :--- | :--- | :--- | :--- |
| **Arrays** | [c/Arrays/](file:///Users/akshit/Desktop/CODE/dsa/c/Arrays) | [java/Arrays/](file:///Users/akshit/Desktop/CODE/dsa/java/Arrays) | Reverse Array, Min/Max element search, Two Sum, Move Zeroes, Prefix Sum |
| **Linked List** | [c/LinkedList/](file:///Users/akshit/Desktop/CODE/dsa/c/LinkedList) | [java/LinkedList/](file:///Users/akshit/Desktop/CODE/dsa/java/LinkedList) | Element insertion/deletion, List Reversal, Binary Search Trees (BST) |
| **Searching** | [c/Searching/](file:///Users/akshit/Desktop/CODE/dsa/c/Searching) | [java/Searching/](file:///Users/akshit/Desktop/CODE/dsa/java/Searching) | Linear Search (O(N)), Binary Search (O(log N) in sorted data) |
| **Sorting** | [c/Sorting/](file:///Users/akshit/Desktop/CODE/dsa/c/Sorting) | [java/Sorting/](file:///Users/akshit/Desktop/CODE/dsa/java/Sorting) | Bubble Sort (O(N²)), Insertion Sort (O(N²)), Quick Sort (O(N log N)), Merge Sort (O(N log N)) |
| **Stack** | [c/Stack/](file:///Users/akshit/Desktop/CODE/dsa/c/Stack) | [java/Stack/](file:///Users/akshit/Desktop/CODE/dsa/java/Stack) | LIFO Stack (Array and Linked list backed), Infix to Postfix, Valid Parentheses |

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
# Example: Bubble Sort
cd java
javac Sorting/BubbleSort.java
java Sorting.BubbleSort
```
*(Alternatively, starting from Java 11+, you can execute single-file source codes directly without manual compilation step:* `java Sorting/BubbleSort.java`*)*

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
