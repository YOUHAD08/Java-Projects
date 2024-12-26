# 🏦 BankAccount - Exception Management with Savings & Current Accounts

This **Java-based console application** serves as a banking simulation to manage accounts, handle various account types (**Savings** and **Current**), and demonstrate robust exception handling. The project includes the use of **custom exceptions**, **inheritance**, and **object-oriented programming (OOP)** principles.

Key functionalities include deposit operations, withdrawals with balance checks, and the management of specialized account types while handling edge cases through custom exceptions.

---

## 📋 Table of Contents

1. [📖 Overview](#-overview)
2. [🗂 Project Structure](#-project-structure)
3. [✨ Features](#-features)
4. [🛠️ Getting Started](#%EF%B8%8F-getting-started)
5. [💻 Usage Instructions](#-usage-instructions)
   - [Account Operations](#account-operations)
6. [🛑 Exception Handling](#-exception-handling)
7. [🚀 Future Enhancements](#-future-enhancements)
8. [📢 Feedback](#-feedback)

---

## 📖 Overview

The **BankAccount** project allows users to:

- Manage **Savings** and **Current** bank accounts with tailored features.
- Perform transactions such as:
   - Deposits.
   - Withdrawals with constraints (e.g., account-specific rules).
   - Balance inquiries.
- Handle account-level errors efficiently using **custom exceptions**.

This project emphasizes **exception management** using custom exceptions to handle cases like:

1. Attempting to access non-existent accounts.
2. Insufficient funds for withdrawals.
3. Invalid operations (e.g., withdrawing more than the available overdraft limit).

---

## 🗂 Project Structure

The project consists of six files, designed for modularity and clarity:

```plaintext
BankAccount/
├── src/
│   ├── AccountNotFoundException.java       # Custom exception for accessing invalid accounts
│   ├── BankAccount.java                    # Abstract base class for bank accounts (Savings and Current)
│   ├── CurrentAccount.java                 # Subclass for Current Accounts with overdraft functionality
│   ├── InsufficientFundsException.java     # Custom exception for handling insufficient balance errors
│   ├── SavingsAccount.java                 # Subclass for Savings Accounts with withdrawal constraints
│   ├── Main.java                           # Entry point for the application (menu-driven program)
└── README.md                               # Project documentation
```

---

## ✨ Features

### 1. **BankAccount Program**
- **Core Bank Account Operations:**
   - Deposit funds into accounts.
   - Withdraw funds with balance and type-specific checks.
   - Display available balance.
- Handles **Savings** and **Current** accounts with tailored behavior:
   - **SavingsAccount**: Withdrawal limits may apply.
   - **CurrentAccount**: Supports overdraft withdrawals within a predefined limit.

### 2. **Exception Handling**
- Invalid actions like attempting to overdraw or access nonexistent accounts are handled via custom exceptions.
- Ensures secure and smooth application execution.

### 3. **SavingsAccount Class**
- Specialized functionality for savings accounts with additional constraints for handling deposits and withdrawals.

### 4. **CurrentAccount Class**
- Includes overdraft management for current accounts.
- Ensures overdrafts don't exceed set limits through custom exceptions.

### 5. **Custom Exceptions**
- **InsufficientFundsException**: Prevents operations when funds are unavailable.
- **AccountNotFoundException**: Thrown when attempting to interact with invalid or nonexistent accounts.

---

## 🛠️ Getting Started

### Prerequisites

To run this project, ensure the following software/tools are installed:

- **Java JDK**: Version 11 or higher.
- A suitable Java IDE like **IntelliJ IDEA**, **Eclipse**, or **VS Code**.

### Installation

1. Clone or download the project repository:
   ```bash
   git clone https://github.com/your-repo-name/BankAccount.git
   ```
2. Navigate to the project folder:
   ```bash
   cd BankAccount/src
   ```
3. Compile the project:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

---

## 💻 Usage Instructions

### Account Operations

When you run the program, you will experience a **menu-driven interface** with options such as:

1. **Create Account**:  
   Create a new Savings or Current account by specifying account details.

2. **Deposit into Account**:  
   Add funds to an existing account by providing the account ID.

3. **Withdraw from Account**:  
   Withdraw funds based on the account's balance (with constraints for overdrafts and withdrawal limits).

4. **Check Account Balance**:  
   View the current balance of a savings or current account.

5. **Exit**:  
   Close the program.

---

## 🛑 Exception Handling

### 1. **InsufficientFundsException**
- **Purpose**: Prevents withdrawals when the requested amount exceeds the available balance (or overdraft limit for current accounts).
- **Thrown By**: Withdrawal operation.

   ```java
   if (withdrawAmount > balance + overdraftLimit) {
       throw new InsufficientFundsException("Insufficient funds for this transaction.");
   }
   ```

### 2. **AccountNotFoundException**
- **Purpose**: Raised when attempting to access an account that does not exist.
- **Thrown By**: Operations like deposit, withdraw, or balance check on invalid account IDs.

   ```java
   if (account == null) {
       throw new AccountNotFoundException("Account not found with ID: " + accountId);
   }
   ```

---

## 🚀 Future Enhancements

1. **Transaction History**:  
   Record transaction logs (deposits/withdrawals) for each account.

2. **Persistent Storage**:  
   Implement a database or file storage system to save account and transaction data between sessions.

3. **Multiple Users**:  
   Enhance the system to handle multiple users with associated login credentials.

4. **Interest Calculation**:  
   Add periodic interest accrual for savings accounts.

5. **Graphical Interface (GUI)**:  
   Replace the command-line interface with a modern GUI using **JavaFX** or **Swing**.

---

## 📢 Feedback

If you have suggestions, improvements, or need assistance, feel free to reach out or fork this repository to contribute your changes!

---

> _"Handling exceptions gracefully is the hallmark of robust software."_  
Happy Coding! 🚀
