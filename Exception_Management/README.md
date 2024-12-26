# Exception_Management - Java Exception Handling Exercises

This project is a collection of **Java exercises** focused on learning and practicing **exception handling** concepts. The exercises have been divided into the following sub-projects:

## 📂 Projects

1. **BankAccount**  
   A simulation of basic bank account operations while demonstrating exception handling for common errors like invalid amounts or insufficient funds.

2. **NaturalNumber**  
   A program to validate and handle operations on natural numbers, including custom exceptions for invalid inputs (e.g., negative numbers or zero).

---

## ▶️ How to Run

1. **Navigate to the Project Folder**:
   ```bash
   cd ExceptionManagement
   ```

2. Each sub-project (`BankAccount`, `NaturalNumber`) can be compiled and run independently. For example:

    - **BankAccount**:
      ```bash
      cd BankAccount
      javac Main.java
      java Main
      ```

    - **NaturalNumber**:
      ```bash
      cd NaturalNumber
      javac Main.java
      java Main
      ```

---

## 🛠️ Key Concepts

### BankAccount

- Protects user accounts through exception handling.
- Common exceptions handled:
    - Withdrawing more than the available balance.
    - Non-existent account.
    - Withdrawing an amount that exceeds the overdraft limit.

---

### NaturalNumber

- Validates natural numbers (positive integers > 0) and prevents invalid operations.
- Throws custom exceptions like `NegativeNumberException` , for invalid inputs, including attempts to decrement the number below zero..

---

## 🏆 Learning Objectives

Through these exercises, i learned:

1. Robust Java programming with **try-catch** blocks.
2. How to Create and use **custom exceptions**.
3. Practicing **input validation** and **defensive programming**.

---

## 🎯 Note

This project is for educational purposes, created as part of exercises during a Java programming course. The goal is to understand and implement **exception management** concepts.

---

> _"Exception handling ensures that when things go wrong, they fail gracefully."_
