# BankAccount - Exception Management Exercise

This is a **Java project** created as part of a school exercise to practice **exception management**. The project implements a simple **Bank Account** system to demonstrate key programming concepts, including **try-catch blocks**, **custom exceptions**, and proper error handling.

---

## 📝 Overview

The **BankAccount** project allows users to perform basic operations on a bank account, such as:

- Depositing money.
- Withdrawing money.
- Checking the account balance.

The primary focus of the project is to handle edge cases and exceptional scenarios, such as:

- Attempting to withdraw more money than available in the account.
- Depositing or withdrawing invalid amounts (e.g., negative or zero).
- Ensuring safe and reliable account operations through exception handling.

---

## 📁 Project Structure

```plaintext
BankAccount/
├── src/
│   ├── BankAccount.java     # Core BankAccount class
│   ├── Main.java            # Entry point for the application
│   ├── InsufficientFundsException.java  # Custom exception for insufficient funds
├── README.md                # Project documentation
```

---

## ▶️ Getting Started

1. **Clone the Repository (if applicable)**:
   ```bash
   git clone https://github.com/example-user/BankAccount.git
   ```

2. **Navigate to the Project Folder**:
   ```bash
   cd BankAccount
   ```

3. **Compile and Run the Project**:
   ```bash
   javac Main.java
   java Main
   ```

---

## 💻 How to Use the Program

1. **Run the Program**:  
   The program will guide the user through different operations like depositing and withdrawing money.

2. **Exception Scenarios**:  
   The program demonstrates proper exception handling for situations like:
    - Trying to withdraw an amount greater than the available balance.
    - Entering non-numeric or invalid values for operations.
    - Attempting to deposit or withdraw invalid amounts.

3. **Example Code Snippet**:
   ```java
   try {
       BankAccount account = new BankAccount(1000);
       account.withdraw(1500); // This will throw an InsufficientFundsException
   } catch (InsufficientFundsException e) {
       System.out.println("Error: " + e.getMessage());
   }
   ```

---

## 🛠️ Key Learning Objectives

This project is designed to help students practice:

1. Writing robust error handling using **try-catch** blocks.
2. Creating and using **custom exceptions**.
3. Validating user input and handling invalid data gracefully.
4. Improving the reliability of Java code through defensive programming techniques.

---

## 📚 Example Exceptions in the Project

### InsufficientFundsException
A custom exception that is thrown when a withdrawal amount exceeds the current balance.

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```

### Example Use
```java
if (withdrawAmount > balance) {
    throw new InsufficientFundsException("Withdrawal amount exceeds available balance.");
}
```

---


## 📢 Feedback

If you have any questions or feedback about this code or concept, feel free to reach out to your instructor or classmates.

---

> _"Programming isn't about just writing code; it's about handling the unexpected."_