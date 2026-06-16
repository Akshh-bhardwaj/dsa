DUCAT — SCHOOL OF AI
PROFESSIONAL TRAINING PROGRAM
Java Programming with
Data Structures & Algorithms
ADVANCED INSTRUCTOR GUIDE
26-Day Day-Wise Lecture Plan  |  4 Hours/Day  |  FAANG-Ready
Designed for Advanced College Students with Java & DSA Background
📋 Course Overview
Attribute
Details
Total Duration
26 Days × 4 Hours = 104 Hours
Target Students
Advanced college students with prior Java & DSA knowledge
Primary Goal
FAANG/Product Company Interviews + Competitive Programming
Session Structure
Theory (1 hr) → Coding Deep Dive (1.5 hr) → Interview Drill (1 hr) → Q&A (30 min)
Assessment
Module Labs 40% | Mid Assessment 20% | Final Project 40%
Programming Language
Java (Java 8+ features actively used)
Tools
IntelliJ IDEA, LeetCode, HackerRank, Custom Judge
🗓️ Weekly Roadmap
Week
Days
Focus Area
Key Outcomes
Week 1
Days 1–5
Java Internals & Advanced OOP
Deep JVM knowledge, Collections internals, Streams, Concurrency
Week 2
Days 6–10
Core Data Structures
Arrays, LL, Stack, Queue, Hashing, Two Pointers — Interview Ready
Week 3
Days 11–15
Trees & Sorting
Binary Trees, BST, Heaps, Tries, All sorting algorithms
Week 4
Days 16–21
Searching, Backtracking & Graphs
Binary Search patterns, Backtracking template, Graph algorithms
Week 5
Days 22–26
Dynamic Programming & Mocks
1D/2D/Advanced DP, Interval DP, Bitmask DP, Full mock interviews
📅 Day-Wise Detailed Lecture Plan
Each day is structured as: Theory → Code → Interview Drill → Q&A
WEEK 1: Java Mastery — Internals, OOP, Collections, Concurrency
DAY 1  Java Internals & OOP Foundations Revisit
📦 Module: Module 1 & 2 — Java Fundamentals + OOP
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
JVM Architecture deep dive: ClassLoader, JIT, Garbage Collection (G1, ZGC)
Memory model: Stack vs Heap, String Pool, Escape Analysis
Data types — autoboxing/unboxing pitfalls, Integer cache (-128 to 127)
Pass-by-value vs pass-by-reference with object references
Immutability — why String is immutable, how to design immutable classes
var keyword (Java 10+), records (Java 16+), sealed classes (Java 17+)
🔬 Lab / Coding Session:
Write a program that demonstrates JVM memory (stack overflow, heap OOM), String pool behavior, and autoboxing trap. Benchmark String vs StringBuilder for 100k concatenations.
🎯 Interview Focus:
Why is String immutable? What is String interning? Difference between == and .equals()? What happens in JVM before main() runs? Explain GC roots.
DAY 2  OOP Pillars — Polymorphism, Abstraction & SOLID
📦 Module: Module 2 — OOP
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Deep dive into runtime polymorphism — dynamic dispatch mechanism
Abstract class vs Interface: when to use which (with Java 8+ default methods)
Functional interfaces: Predicate, Function, Consumer, Supplier
SOLID Principles with real-world violations and refactored solutions
Design Patterns preview: Singleton, Factory, Builder, Strategy
Constructor chaining, covariant return types
🔬 Lab / Coding Session:
Refactor a poorly written Employee Payroll System violating SOLID into a clean, extensible design. Implement Factory pattern for Shape creation.
🎯 Interview Focus:
Can an interface have a constructor? Can abstract class implement interface? What is diamond problem and how Java resolves it? Explain Liskov Substitution with example.
DAY 3  Generics, Collections Framework Internals
📦 Module: Module 3 — Advanced Java
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Generics deep dive: bounded wildcards (? extends T, ? super T), PECS rule
Type erasure and its implications at runtime
ArrayList vs LinkedList internal implementation (resizing, node pointers)
HashMap internals: hashCode(), equals(), bucket structure, load factor, treeification (Java 8+)
TreeMap (Red-Black Tree), LinkedHashMap (insertion order), WeakHashMap
Fail-fast vs Fail-safe iterators; ConcurrentModificationException
🔬 Lab / Coding Session:
Implement a custom generic Stack<T> with bounded type. Demonstrate HashMap collision by overriding hashCode. Compare performance of HashMap vs TreeMap for 1M inserts.
🎯 Interview Focus:
How does HashMap handle collision? What is the significance of load factor 0.75? Why must hashCode and equals be consistent? What is treeification threshold?
DAY 4  Lambda, Streams & Functional Programming
📦 Module: Module 3 — Advanced Java
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Lambda expressions: syntax, effectively final, method references (4 types)
Stream API pipeline: intermediate vs terminal operations
Advanced stream ops: flatMap, groupingBy, partitioningBy, toMap collectors
Parallel streams: ForkJoinPool, when to use vs avoid
Optional<T>: proper usage, avoiding NoSuchElementException
CompletableFuture basics for async programming
🔬 Lab / Coding Session:
Given a list of 10,000 employees: find top 5 highest paid per department using streams; group by city; compute average salary. Compare sequential vs parallel stream performance.
🎯 Interview Focus:
What is the difference between map and flatMap? When would you NOT use parallel streams? How does Stream.collect() work? What is a spliterator?
DAY 5  Multithreading, Concurrency & Exception Handling
📦 Module: Module 3 — Advanced Java
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Thread lifecycle, Thread vs Runnable vs Callable<V>
synchronized keyword, intrinsic locks, ReentrantLock, ReadWriteLock
volatile keyword, happens-before guarantee, memory visibility
ExecutorService: ThreadPoolExecutor, FixedThreadPool, ForkJoinPool
Deadlock, livelock, starvation — detection and prevention
Exception handling best practices: checked vs unchecked, custom hierarchy, try-with-resources
🔬 Lab / Coding Session:
Implement a Producer-Consumer problem using BlockingQueue. Simulate deadlock and fix it using lock ordering. Build a thread-safe LRU Cache using ConcurrentHashMap.
🎯 Interview Focus:
What is the difference between synchronized method and synchronized block? Explain volatile vs AtomicInteger. How does ThreadLocal work? What is a daemon thread?
WEEK 2: Core Data Structures — Arrays, LL, Stack, Queue, Hashing
DAY 6  Big-O Analysis & Arrays Mastery
📦 Module: Module 4 — Core Data Structures
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Big-O, Big-Θ, Big-Ω — precise definitions, common complexity classes
Amortized analysis (ArrayList add, push to stack)
Space complexity analysis with recursion stack
Sliding Window technique: fixed and variable window
Prefix Sum: range sum queries, 2D prefix sum
Kadane's Algorithm for Maximum Subarray Sum
Dutch National Flag / 3-way partition
🔬 Lab / Coding Session:
Solve: Maximum sum subarray (Kadane's), Minimum window substring, Best time to buy and sell stock (I, II, III), Trapping Rainwater, Product of array except self.
🎯 Interview Focus:
Explain Kadane's intuition. What is the sliding window template? How does prefix sum enable O(1) range queries? When does amortized O(1) apply?
DAY 7  Linked Lists — Complete Mastery
📦 Module: Module 4 — Core Data Structures
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Singly LL: all operations, reversal (iterative + recursive), reversal of k-group
Two-pointer technique on LL: middle node, nth from end, cycle detection
Floyd's Cycle Detection — proof of correctness, finding cycle start
Merge two sorted linked lists, merge K sorted lists (min-heap approach)
Doubly LL: LRU Cache full implementation
Skip List concept and applications
🔬 Lab / Coding Session:
Implement: Reverse linked list in k-groups, Flatten a multilevel doubly linked list, LRU Cache (O(1) get and put), Clone linked list with random pointers, Add two numbers as LL.
🎯 Interview Focus:
How to detect and find the start of a cycle? How to reverse a linked list in groups of k? What is the time complexity of LRU Cache operations?
DAY 8  Stacks & Queues — Patterns & Problems
📦 Module: Module 4 — Core Data Structures
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Monotonic stack pattern: next greater element (left/right), stock span
Implementing min-stack with O(1) getMin
Expression evaluation: infix to postfix, balanced parentheses
Circular Queue implementation, why we use it
Deque for sliding window maximum
BFS using queue — level-order traversal pattern
Stack using two queues, Queue using two stacks
🔬 Lab / Coding Session:
Solve: Largest Rectangle in Histogram, Trapping rainwater (stack approach), Daily temperatures, Online stock span, Sliding window maximum, Decode string (nested).
🎯 Interview Focus:
Explain the monotonic stack pattern. How do you solve 'next greater element'? How to implement getMin() in O(1)? When is Deque preferred over Queue?
DAY 9  Hashing — Deep Patterns & Problems
📦 Module: Module 4 — Core Data Structures
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Hash function design, collision resolution (separate chaining vs open addressing)
Rolling hash (Rabin-Karp) for substring search
Two-sum, three-sum patterns using HashMap
Frequency counting patterns: anagram grouping, top K frequent elements
Subarray with given sum (using prefix sum + hashmap)
Union-Find (DSU) — weighted quick-union with path compression
🔬 Lab / Coding Session:
Solve: Group anagrams, Longest consecutive sequence, Subarray sum equals K, 4Sum, Find all anagrams in string, Longest substring without repeating characters, Word pattern.
🎯 Interview Focus:
How does Java's HashMap implement hashCode for String? What is the time complexity of HashMap operations? Explain open addressing vs chaining.
DAY 10  Two Pointers, Sliding Window & Bit Manipulation
📦 Module: Modules 4 & 6
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Two-pointer framework: sorted arrays, pair/triplet sum, container with water
Fast & slow pointer pattern (tortoise and hare)
Sliding window: minimum size subarray, longest substring with at most K distinct chars
Bit manipulation: AND, OR, XOR, NOT, shifts
Common bit tricks: count set bits, power of 2, swap without temp, find single number
XOR applications: find missing number, find two non-repeating numbers
🔬 Lab / Coding Session:
Solve: 3Sum, 4Sum, Container with most water, Minimum window substring, Longest subarray with at most K zeros, Single Number I/II/III, Missing Number, Reverse Bits.
🎯 Interview Focus:
How to count set bits efficiently? Why XOR is used to find odd-occurring element? What is Brian Kernighan's algorithm? How to check if number is power of 2?
WEEK 3: Trees, Heaps & Sorting Algorithms
DAY 11  Binary Trees — Traversals & Core Problems
📦 Module: Module 5 — Trees
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Tree terminology, height, depth, level, size
All 4 traversals: inorder, preorder, postorder (recursive + iterative using stack)
Level-order traversal (BFS), zigzag level order
Diameter of binary tree, maximum path sum
Lowest Common Ancestor (LCA) — binary tree
Tree construction from traversals (inorder + preorder/postorder)
Serialize and deserialize binary tree
🔬 Lab / Coding Session:
Solve: Binary tree right side view, Symmetric tree, Same tree, Invert binary tree, Max depth, Path sum I/II, Flatten binary tree to linked list, Vertical order traversal.
🎯 Interview Focus:
How do you traverse a tree iteratively? How does Morris traversal achieve O(1) space? Explain LCA algorithm. How to construct tree from inorder + preorder?
DAY 12  Binary Search Trees & Balanced Trees
📦 Module: Module 5 — Trees
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
BST properties, inorder gives sorted order
Insert, search, delete (3 cases for delete)
BST validation (correct vs incorrect approaches)
Inorder successor/predecessor, floor/ceiling in BST
Kth smallest/largest in BST (follow-up: frequent queries)
AVL Tree rotations: LL, RR, LR, RL — balance factor
Red-Black Tree properties (conceptual) — used in TreeMap/TreeSet
🔬 Lab / Coding Session:
Implement BST from scratch with all operations. Solve: Validate BST, Recover BST (two nodes swapped), BST to sorted doubly linked list, Count nodes in complete binary tree, Convert sorted array to BST.
🎯 Interview Focus:
Why delete in BST is complex? What is the time complexity of BST operations in worst case? How does TreeMap maintain sorted order? Compare AVL vs Red-Black Tree.
DAY 13  Heaps, Priority Queue & Top-K Problems
📦 Module: Module 5 — Trees
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Binary heap properties, complete binary tree as array
Heapify up and down operations, build heap in O(n)
Heap Sort — in-place, not stable
Java PriorityQueue internals, custom comparators
Top-K frequent elements, K closest points to origin
Kth largest element — heap vs quickselect comparison
Merge K sorted lists/arrays using min-heap
Median of data stream (two heaps)
🔬 Lab / Coding Session:
Solve: Top K frequent elements, Kth largest in stream, Merge K sorted lists, Ugly Number II, Task Scheduler, Find median from data stream, Reorganize string.
🎯 Interview Focus:
Why build heap is O(n) not O(n log n)? When to use min-heap vs max-heap for top-K? What is quickselect and its average complexity? Compare heap sort vs merge sort.
DAY 14  Tries, Segment Trees & Advanced Structures
📦 Module: Module 5 — Trees
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Trie (prefix tree): insert, search, startsWith — implementation
Trie applications: autocomplete, longest common prefix, word search II
Segment tree: build, range query, point update
Lazy propagation for range update queries
Fenwick Tree (BIT): prefix sum, range updates
Sparse Table for range minimum query (RMQ) — O(1) query
Disjoint Set Union: union by rank + path compression
🔬 Lab / Coding Session:
Implement Trie and solve: Word Search II (Trie + backtracking), Replace words, Palindrome pairs. Build Segment Tree and solve range sum queries with updates.
🎯 Interview Focus:
When would you use a Trie over a HashMap? What is lazy propagation? When is Fenwick Tree preferred over Segment Tree? Explain path compression in DSU.
DAY 15  Sorting Algorithms — Deep Dive & Interview
📦 Module: Module 6 — Sorting & Searching
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Bubble, Selection, Insertion sort — stability analysis, when useful (nearly sorted)
Merge Sort — divide & conquer, external sort application, time O(n log n) space O(n)
Quick Sort — Lomuto vs Hoare partition, 3-way partition, randomized pivot
Heap Sort — in-place O(n log n), not stable
Counting, Radix, Bucket Sort — linear time sorting, when applicable
Tim Sort — Java's Arrays.sort(), hybrid approach
Sorting custom objects: Comparable vs Comparator
🔬 Lab / Coding Session:
Implement all sorts from scratch. Solve: Sort colors (Dutch flag), Merge intervals, Meeting rooms II, Largest number, Count of smaller numbers after self, Sort linked list.
🎯 Interview Focus:
Why does Java use TimSort for objects but dual-pivot quicksort for primitives? When is counting sort not applicable? What makes merge sort suitable for external sorting?
WEEK 4: Binary Search, Backtracking, Greedy & Graphs
DAY 16  Binary Search — All Patterns
📦 Module: Module 6 — Sorting & Searching
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Binary search template — left/right boundary, loop invariant
Search in rotated sorted array (with and without duplicates)
First and last occurrence, count of occurrences
Binary search on answer: minimum days, book allocation, painter's partition
Peak element finding, mountain array
Sqrt decomposition and square root using binary search
Median of two sorted arrays — O(log(min(m,n)))
🔬 Lab / Coding Session:
Solve: Search in rotated array I/II, Find minimum in rotated array, Capacity to ship packages in D days, Koko eating bananas, Split array largest sum, Median of two sorted arrays.
🎯 Interview Focus:
Explain binary search template with left/right boundary. How to handle duplicates in rotated array search? What is 'binary search on answer' paradigm?
DAY 17  Recursion & Backtracking — Complete Framework
📦 Module: Module 6 — Algorithm Design
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Recursion tree visualization, overlapping subproblems identification
Tail recursion and JVM optimization
Backtracking template: choose → explore → unchoose
Permutations (with/without duplicates), combinations, subsets
N-Queens — pruning strategies
Sudoku Solver — constraint propagation
Word search on grid, letter combinations of phone number
Palindrome partitioning
🔬 Lab / Coding Session:
Solve all classic backtracking: Subsets I/II, Permutations I/II, Combination Sum I/II/III, N-Queens, Sudoku Solver, Word Search, Palindrome Partitioning, Generate Parentheses.
🎯 Interview Focus:
What is the time complexity of generating all subsets? How does pruning improve backtracking? Difference between backtracking and brute force? How to handle duplicates in subsets?
DAY 18  Divide & Conquer + Greedy Algorithms
📦 Module: Module 6 — Algorithm Design
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Divide & Conquer template: divide, solve, combine
Master Theorem for recurrence analysis
Merge Sort analysis via recursion tree
Closest pair of points — O(n log n)
Greedy algorithm correctness: exchange argument proof
Activity selection, interval scheduling maximization
Huffman encoding, fractional knapsack
Jump Game, Gas Station, Minimum number of arrows
🔬 Lab / Coding Session:
Solve: Merge K sorted arrays, Count inversions (merge sort), Activity selection, Non-overlapping intervals, Jump Game I/II, Gas Station, Partition labels, Candy distribution.
🎯 Interview Focus:
How do you prove a greedy algorithm is correct? What is exchange argument? When does greedy fail (0/1 knapsack)? What is the master theorem and its 3 cases?
DAY 19  Graphs — Representations, BFS & DFS
📦 Module: Module 7 — Graphs
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Graph representations: adjacency list vs matrix, edge list — space-time tradeoffs
BFS: shortest path in unweighted graph, level-order, bipartite check
DFS: connected components, cycle detection (directed vs undirected)
Time/discovery timestamps in DFS, bridges and articulation points
Multi-source BFS (0/1 matrix, walls and gates)
Flood fill, number of islands variants
🔬 Lab / Coding Session:
Solve: Number of Islands I/II, Surrounded Regions, Word Ladder (BFS), Rotten Oranges, Course Schedule I (cycle detection), Bipartite Graph check, Pacific Atlantic Water Flow.
🎯 Interview Focus:
When is BFS preferred over DFS? How to detect a cycle in directed graph? What is the time complexity of BFS/DFS? Explain multi-source BFS with example.
DAY 20  Shortest Path & Minimum Spanning Tree
📦 Module: Module 7 — Graphs
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Dijkstra's algorithm — min-heap implementation, proof of correctness
Dijkstra limitation: no negative weights
Bellman-Ford — handles negative weights, detects negative cycles
Floyd-Warshall — all-pairs shortest path O(V³)
Prim's algorithm for MST — greedy approach
Kruskal's algorithm — sort edges + DSU
Applications: network design, road planning
🔬 Lab / Coding Session:
Implement Dijkstra's and Bellman-Ford. Solve: Network delay time, Cheapest flights within K stops, Path with minimum effort, Swim in rising water, Find critical and pseudo-critical edges in MST.
🎯 Interview Focus:
Why can't Dijkstra handle negative weights? What is the time complexity of Dijkstra with min-heap? When to use Prim's vs Kruskal's? Explain why Bellman-Ford runs V-1 times.
DAY 21  Topological Sort, Advanced Graph Algorithms
📦 Module: Module 7 — Graphs
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Topological sort: DFS-based, Kahn's algorithm (BFS-based)
Course scheduling, task ordering with dependencies
Detecting cycle in DAG vs undirected graph
Strongly Connected Components: Kosaraju's, Tarjan's algorithms
Bridges and Articulation Points
Eulerian path/circuit conditions
Graph coloring, bipartite check revisited
🔬 Lab / Coding Session:
Solve: Course Schedule II (topological order), Alien Dictionary (topo sort on chars), Parallel courses, Minimum height trees, Reconstruct itinerary (Eulerian path), Critical connections in network.
🎯 Interview Focus:
What is the difference between Kahn's and DFS-based topological sort? When does topological sort fail? What are SCCs used for in practice? Explain Kosaraju's two-pass DFS.
WEEK 5: Dynamic Programming & Mock Interviews
DAY 22  Dynamic Programming — Foundations & 1D DP
📦 Module: Module 7 — Dynamic Programming
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
DP paradigm: optimal substructure + overlapping subproblems
Memoization (top-down) vs Tabulation (bottom-up) — space optimization
State design: what to store, transition relation
Classic 1D DP: Fibonacci, Climbing Stairs, House Robber I/II
Coin Change (min coins, count ways), Unbounded Knapsack
Jump Game DP approach vs greedy
Decode Ways, Word Break
🔬 Lab / Coding Session:
Solve: Climbing stairs, House Robber I/II/III, Coin Change I/II, Decode Ways, Word Break, Jump Game, Perfect Squares, Integer Break, Arithmetic Slices.
🎯 Interview Focus:
How do you identify a DP problem? What is the difference between memoization and tabulation in terms of space? How to optimize space in 1D DP? What is state compression?
DAY 23  2D DP — Knapsack, LCS, Matrix Problems
📦 Module: Module 7 — Dynamic Programming
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
0/1 Knapsack — O(n*W) DP, space optimization to O(W)
Subset Sum, Partition Equal Subset Sum, Target Sum
Longest Common Subsequence (LCS) and its variants
Longest Common Substring, Shortest Common Supersequence
Edit Distance (Levenshtein) — insert, delete, replace
Unique Paths, Minimum Path Sum, Triangle
Maximal Square, Maximal Rectangle
🔬 Lab / Coding Session:
Solve: 0/1 Knapsack, Partition Equal Subset Sum, Longest Common Subsequence, Edit Distance, Unique Paths I/II, Minimum Path Sum, Maximal Square, Interleaving String.
🎯 Interview Focus:
How to reconstruct the LCS string (not just length)? What is the space-optimized knapsack? How is Edit Distance used in practice (spell checkers, DNA)? Explain Maximal Square DP.
DAY 24  Advanced DP — Interval, Tree & Bitmask DP
📦 Module: Module 7 — Dynamic Programming
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Interval DP: Matrix Chain Multiplication, Burst Balloons, Stone Game
DP on Trees: Maximum independent set, diameter, re-rooting technique
Bitmask DP: traveling salesman problem, assignment problems
DP with states: stock problems (at most K transactions, with cooldown/fee)
Longest Increasing Subsequence — O(n²) and O(n log n) with patience sorting
Russian Doll Envelopes (2D LIS)
🔬 Lab / Coding Session:
Solve: Burst Balloons, Matrix Chain Multiplication, Stock Buy/Sell with at most K transactions, House Robber III (tree DP), Longest Increasing Subsequence (O(n log n)), Russian Doll Envelopes.
🎯 Interview Focus:
Explain the patience sorting algorithm for LIS. How does bitmask DP work for TSP? What makes interval DP different? How to handle stock problems with multiple constraints?
DAY 25  Mock Interview Day 1 — Data Structures
📦 Module: Assessment — DS-focused Problems
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Timed problem solving: 2 medium + 1 hard (45 min each)
Arrays & Strings: hard-level sliding window and prefix sum
Linked Lists & Trees: complex pointer manipulation
Heaps & Hashmaps: design problems
Code review and discussion of time/space complexity
Behavioral questions: STAR method, project discussions
🔬 Lab / Coding Session:
Live coding: LFU Cache, Serialize/Deserialize N-ary Tree, Find K pairs with smallest sums, Sliding window median. Full walkthrough with approach → code → optimize.
🎯 Interview Focus:
Full mock technical interview format. Cover: 'Walk me through your approach', 'Can you optimize this?', 'What are edge cases?', 'How would you test this code?'
DAY 26  Mock Interview Day 2 — Algorithms & System Design Intro
📦 Module: Assessment — Algorithm-focused + Design
🕐 Duration: 4 Hours  |  Format: Theory → Code → Interview Drill
Topics Covered:
Timed problem solving: 2 medium + 1 hard graph/DP problems
Graphs: hard variants of Dijkstra's, topological sort
DP: combination of two DP patterns
Introduction to System Design concepts (for product companies)
Object-Oriented Design: design patterns in system context
Final Q&A, personalized weak area feedback
🔬 Lab / Coding Session:
Live coding: Alien Dictionary, Minimum cost to connect all points, Word Ladder II, Regular Expression Matching, Wildcard Matching. System design: design a URL shortener.
🎯 Interview Focus:
Mock interview: 'Design a rate limiter', 'Implement LRU Cache + explain design choices', 'How would you scale this to millions of users?'. Review all FAANG-style behavioral questions.
🎯 Interview Question Bank by Topic
Java Internals & OOP
Explain JVM memory areas: method area, heap, stack, PC register, native method stack
What is the difference between JDK, JRE, and JVM?
How does Garbage Collection work? Explain G1GC.
Why is String immutable in Java? What are the benefits?
What is the difference between abstract class and interface? When to use which?
Explain all four pillars of OOP with examples.
What are the SOLID principles? Give a real violation and fix.
What is the difference between method overloading and overriding?
Explain covariant return type.
What is dynamic dispatch? How does Java achieve runtime polymorphism?
Collections & Generics
How does HashMap work internally? What happens during put()?
What is treeification in Java 8 HashMap?
Difference between ArrayList and LinkedList — when to use which?
What is fail-fast iterator? How does it work?
Explain the PECS rule in Java Generics.
What is type erasure? How does it affect generics at runtime?
How does PriorityQueue maintain heap property in Java?
What is the difference between Comparable and Comparator?
Explain ConcurrentHashMap vs synchronized HashMap.
What is WeakHashMap? When would you use it?
Arrays & Strings
Explain Kadane's algorithm with proof.
What is the sliding window technique? Give two variants.
How does prefix sum enable O(1) range queries?
How to find all subarrays with sum equal to K? What's the complexity?
How to find the longest palindromic substring? Give two approaches.
Explain the Dutch National Flag algorithm.
How to find the minimum window substring?
How to rotate an array in O(n) time and O(1) space?
Explain the two-pointer technique for sorted array problems.
What is the KMP algorithm? How does failure function work?
Trees & Graphs
How to find LCA of two nodes in a binary tree?
Explain Morris Traversal — how does it achieve O(1) space?
How to serialize and deserialize a binary tree?
What is the time complexity of heap operations? Why build-heap is O(n)?
Explain Dijkstra's algorithm. Why can't it handle negative weights?
What is topological sort? When does it fail?
Explain Kruskal's vs Prim's algorithm for MST.
What are strongly connected components? Explain Kosaraju's algorithm.
How does Union-Find with path compression achieve near O(1) operations?
Explain BFS vs DFS — when is each preferred?
Dynamic Programming
How do you identify if a problem can be solved with DP?
What is the difference between memoization and tabulation?
Explain 0/1 Knapsack and its space optimization.
What is the LCS algorithm? How to reconstruct the actual string?
Explain Edit Distance and its applications.
What is the O(n log n) algorithm for LIS? Explain patience sorting.
How does bitmask DP work? Give an example.
Explain Interval DP with Matrix Chain Multiplication.
How to solve the stock buy/sell problem with at most K transactions?
What is DP on trees? Explain the re-rooting technique.
📌 Curated LeetCode Problem List — Must Solve
Arrays & Strings
Problem
Difficulty
Pattern
Two Sum
Easy
HashMap
Best Time to Buy and Sell Stock
Easy
Greedy/DP
Maximum Subarray (Kadane's)
Medium
DP/Greedy
Product of Array Except Self
Medium
Prefix/Suffix
Minimum Window Substring
Hard
Sliding Window
Trapping Rain Water
Hard
Two Pointer/Stack
Longest Substring Without Repeating
Medium
Sliding Window
Container With Most Water
Medium
Two Pointer
3Sum
Medium
Two Pointer
Median of Two Sorted Arrays
Hard
Binary Search
Trees & Graphs
Problem
Difficulty
Pattern
Number of Islands
Medium
BFS/DFS
Binary Tree Level Order Traversal
Medium
BFS
Lowest Common Ancestor of BST
Medium
Tree
Serialize and Deserialize Binary Tree
Hard
Tree/BFS
Word Ladder
Hard
BFS
Course Schedule II
Medium
Topological Sort
Network Delay Time
Medium
Dijkstra
Find Critical Connections
Hard
DFS/Bridges
Alien Dictionary
Hard
Topological Sort
Cheapest Flights Within K Stops
Medium
Bellman-Ford
Dynamic Programming
Problem
Difficulty
Pattern
Climbing Stairs
Easy
1D DP
Coin Change
Medium
Unbounded Knapsack
Longest Increasing Subsequence
Medium
DP/BinarySearch
Edit Distance
Hard
2D DP
Partition Equal Subset Sum
Medium
0/1 Knapsack
Burst Balloons
Hard
Interval DP
Best Time to Buy/Sell Stock IV
Hard
DP with states
Word Break II
Hard
Backtracking+Memo
Regular Expression Matching
Hard
2D DP
Russian Doll Envelopes
Hard
2D LIS
📊 Assessment & Evaluation Plan
Component
Weight
Format
When
Module Labs
40%
Hands-on coding submissions after each module
End of each module (Days 5, 10, 15, 21)
Mid Assessment
20%
2-hour exam: 3 coding problems (Easy/Medium/Hard)
Day 14
Final Project
40%
Capstone: Pathfinder city-map navigator + live demo
Day 26
Grading Rubric for Coding Problems
Criterion
Excellent (A)
Good (B)
Average (C)
Correctness
All test cases pass
90%+ test cases pass
Basic cases pass
Time Complexity
Optimal solution
One level above optimal
Brute force
Code Quality
Clean, modular, well-named
Readable, minor issues
Functional but messy
Edge Case Handling
All edges handled
Most edges handled
Basic edge cases
Communication
Clear explanation + tradeoffs
Can explain approach
Code only