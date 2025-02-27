# 🚀 Project 1: Talkative

## 📌 Overview
Talkative is a simple Java program that demonstrates multithreading using the `Runnable` interface. Each thread prints a multiple of 100 based on a given number. This project highlights the power of concurrent execution in Java.

## 🛠 Features
✅ Implements multithreading with `Runnable` 

✅ Executes multiple threads simultaneously

✅ Showcases concurrent execution and race conditions

## 🚀 Getting Started
### Prerequisites
- Java JDK 8 or later

### Installation & Execution
```sh
# Compile the Java file
javac Talkative.java

# Run the program
java Threads.Talkative
```

## 📜 Code Breakdown
- **Talkative Class**: Implements `Runnable` and overrides `run()` to print `100 * nb`.
- **Main Method**:
  - Initializes multiple threads.
  - Each thread executes independently, leading to unpredictable order.

## 🎯 Sample Output
```
100
200
300
300
400
500
600
700
800
900
1000
```
*(Note: The order may vary due to concurrent execution.)*

---

# ⚡ Project 2: Adder

## 📌 Overview
Adder is a Java program utilizing `ExecutorService` to perform parallel summation of an array. It splits a 100-element array into 10 parts and assigns each part to a separate thread.

## 🛠 Features
✅ Uses `ExecutorService` for efficient thread management

✅ Parallel computation of array segments

✅ Demonstrates controlled thread execution with a fixed thread pool

## 🚀 Getting Started
### Prerequisites
- Java JDK 8 or later

### Installation & Execution
```sh
# Compile the Java file
javac Adder.java

# Run the program
java Threads.Adder
```

## 📜 Code Breakdown
- **Adder Class**:
  - Implements `Runnable`.
  - Computes the sum of a sub-array.
- **Main Method**:
  - Initializes an array with values `0-99`.
  - Uses `ExecutorService` to divide the workload among 10 threads.
  - `Thread.sleep(1000)` simulates processing time.
  - Prints the total sum using `Arrays.stream()`.

## 🎯 Sample Output
```
45
145
245
345
445
545
645
745
845
945
4950
```
*(Total sum of numbers from 0 to 99 is 4950.)*

---
📝 **Author**: Youhad Ayoub

📌 **Last Updated**: 2025-02-27

💡 *Feel free to modify and expand these projects!*

