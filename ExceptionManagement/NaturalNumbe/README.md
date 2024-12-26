# 🌟 Natural Number Project

## 📜 Overview

The **Natural Number Project** is a Java-based application that focuses on demonstrating **exception handling** in object-oriented programming. It deals with operations related to natural numbers while ensuring proper handling of error scenarios like invalid or negative inputs.

This project leverages **custom exceptions** to enforce input validation and demonstrates advanced exception-handling techniques following best practices in Java.

## ✨ Features

✔️ **Validation of Natural Numbers**: Ensures only valid natural numbers (non-negative integers) are accepted.  
✔️ **Custom Exception**: Implements a user-defined exception class, `NegativeNumberException`, to handle invalid inputs.  
✔️ **User-Friendly Error Handling**: Provides clear and concise feedback to users when errors occur.  
✔️ **Testable Code Structure**: Demonstrates its functionality via a `Main` class for concise testing and execution.

## 📂 Project Structure

Here’s how the application is organized:

- **`Natural_Number.java`**  
  🌐 This is the main class that encapsulates all functionality related to natural numbers, such as validation and basic operations. It ensures inputs conform to the natural numbers domain.

- **`NegativeNumberException.java`**  
  🚨 A custom exception class specifically designed to handle cases where negative numbers are encountered, ensuring logical consistency.

- **`Main.java`**  
  ▶️ The entry point for the application, showcasing the functionality of the `Natural_Number` class, and handling exceptions gracefully.

- **`App.java`**  
  🛠️ This file possibly contains utility or supplementary code to support the main logic of exception handling.

## 💻 Requirements

To run the project, ensure you have the following:

- **Java Version**: 11 or later 🛠️
- **IDE**: IntelliJ IDEA (Recommended) ✔️

## 🚀 Getting Started

Follow these steps to run the project:

1. **Clone or Download** the project into your working directory. 🗂️
   ```bash
   git clone <repository_url>
   ```

2. **Open the Project** in IntelliJ IDEA.

3. **Compile the Code**:  
   Navigate to `Build > Build Project`.

4. **Run the Main Class**:  
   Execute the `Main` class to see the program in action!

## 🤔 How It Works

1. Once you run the program, it will **prompt you for a number** input.
2. The program will check if the input is a natural number (0 or positive integer). ✔️
3. If the input is valid, it will display a success message. 🟩
4. If the input is **negative**, it will throw a `NegativeNumberException` with a proper error message. ❌

## 🛠️ Example Exception Handling

Here's a sample of how the application works internally:

```java
try {
    Natural_Number number = new Natural_Number(-5); // Invalid input
} catch (NegativeNumberException e) {
    System.out.println("Error: " + e.getMessage());
}
```

**Sample Output for Invalid Input**:

Error: Negative numbers are not allowed.

**Sample Output for Valid Input**:

Success: You entered a valid natural number!

## 🧐 Purpose

This project is designed for **educational purposes**, showcasing:

- **Custom Exception Handling**: Writing your own exceptions like `NegativeNumberException`.
- **Robust Error Management**: Detecting and gracefully handling invalid inputs.
- **Natural Number Operations**: Handling validation and operations on non-negative integers.

## 👩‍💻 Author

This project is part of Java programming exercises to enhance understanding of **object-oriented programming** concepts and **exception handling** techniques.

## 📜 License

This project is licensed under the **MIT License**. Feel free to modify and use it for educational purposes.

🌟 *If you found this project helpful, feel free to star the repository and share your feedback!* 🌟