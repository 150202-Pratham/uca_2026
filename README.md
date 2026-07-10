# 🚀 UCA 2026

Welcome to my **UCA 2026 Learning Repository**.

This repository documents my learning journey throughout UCA 2026. It contains implementations of programming concepts, data structures, algorithms, Linux utilities, system-level programming, and benchmarking projects completed during my coursework and self-study.

---

# 📂 Repository Structure

```text
uca_2026/
│
├── C/
│   ├── Basic Programs/
│   ├── Linux Commands/
│   │   └── cp_implementation/
│   ├── SortingImplementation/
│   │   ├── main.c
│   │   ├── sorting.c
│   │   ├── sorting.h
│   │   ├── generator.c
│   │   ├── generator.h
│   │   ├── timer.c
│   │   ├── timer.h
│   │   ├── Makefile
│   │   └── results.csv
│   │
│   └── ...
│
├── Java/
│   └── HelloUCA.java
│
├── .gitignore
└── README.md
```

---

# 💻 C Programming

This section contains C programming assignments, Linux programming exercises, and algorithm implementations.

Current Topics

- Basic C Programs
- File Handling
- Modular Programming
- Makefile
- Linux System Programming
- Implementation of Linux `cp` Command
- Sorting Algorithms
- Execution Time Benchmarking

---

# 📁 Linux Programming

### Linux `cp` Command Implementation

Implemented a simplified version of the Linux **cp** utility in C.

### Features

- Copy file contents
- Error handling
- Command-line arguments
- File I/O using system calls / standard library (depending on implementation)

---

# 📊 Sorting Algorithm Benchmark

Implemented and analyzed the execution time of the following sorting algorithms:

- Bubble Sort
- Insertion Sort
- Selection Sort
- Quick Sort
- Merge Sort
- Heap Sort

---

## Input Types

Each algorithm is tested using:

- Random Input
- Ascending Input
- Descending Input

---

## Input Sizes

Benchmark executed for:

```text
8000
12000
16000
20000
24000
28000
32000
36000
```

---

## Output

The benchmark automatically generates:

- `results.csv`

The generated dataset is used to visualize algorithm complexity in Microsoft Excel.

---

# ⚡ Time Complexity Summary

| Algorithm | Best | Average | Worst |
|------------|--------|------------|----------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) |

---

# ⚙️ Build Instructions

Compile the project

```bash
make
```

Run

```bash
make run
```

Clean generated files

```bash
make clean
```

---

# 🛠 Technologies Used

- C
- Java
- GCC
- Makefile
- Linux
- Git
- GitHub
- Microsoft Excel

---

# 📅 Progress Log

| Date | Update |
|------|--------|
| 01 July 2026 | Created Repository |
| 01 July 2026 | Added Basic C Program |
| 01 July 2026 | Added Java Program |
| July 2026 | Implemented Linux `cp` Command |
| July 2026 | Added Sorting Algorithm Implementations |
| July 2026 | Implemented Benchmarking Framework |
| July 2026 | Added CSV Export for Performance Analysis |
| July 2026 | Added Makefile Support |

---

# 🎯 Learning Objectives

This repository is intended to strengthen understanding of:

- C Programming
- Java Programming
- Linux Commands
- File Handling
- Modular Programming
- Makefiles
- Sorting Algorithms
- Time Complexity Analysis
- Performance Benchmarking
- Git & GitHub Workflow

---

# 🚧 Future Work

Planned additions include:

- Searching Algorithms
- Linked Lists
- Stacks & Queues
- Trees
- Graph Algorithms
- Dynamic Programming
- Operating System Concepts
- Computer Networks
- Database Management System (DBMS)
- System Design Notes

---

# 👨‍💻 Author

**Pratham Garg**

This repository serves as a record of my programming practice, coursework, and continuous learning throughout UCA 2026.
