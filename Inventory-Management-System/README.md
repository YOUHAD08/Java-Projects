# 📦 Inventory Management System Project

The **Inventory Management System** project is a Java-based console application that supports comprehensive inventory operations, including **adding**, **modifying**, **deleting**, **searching for products**, and **calculating the total stock value**.

This project demonstrates the evolution of programming techniques by implementing **procedural programming** and **object-oriented programming (OOP)** approaches.

---

## 📋 Table of Contents

1. [📖 Introduction](#-introduction)
2. [🏗 Project Structure](#-project-structure)
3. [✨ Features](#-features)
4. [🛠 Technologies Used](#-technologies-used)
5. [📚 Examples](#-examples)
   - [Procedural Programming Implementation](#procedural-programming-implementation)
   - [Object-Oriented Programming Implementation](#object-oriented-programming-implementation)
6. [🚀 Future Enhancements](#-future-enhancements)

---

## 📖 Introduction

The **Inventory Management System** is a **menu-driven console application** designed for efficient inventory operations. The project was developed in **two stages**:

1. **🔹 Procedural Programming**:  
   The initial version utilized **static methods** and **arrays** for operations like adding, searching, and deleting products.

2. **🔹 Object-Oriented Programming (OOP)**:  
   Refactored to follow OOP principles, introducing **classes**, **objects**, and structured modularity for better scalability and maintainability.

This journey highlights the transition from procedural to object-oriented design in Java.

---

## 🏗 Project Structure

The **OOP** version follows a modular architecture, with the following key components:

- **`Product.java`**:  
  Encapsulates product attributes (`ID`, `Name`, `Quantity`, `Price`) and provides methods to manage individual product objects.

- **`App_Manager.java`**:  
  Implements the core inventory operations such as adding, modifying, deleting, displaying, and searching for products using a list of `Product` objects.

- **`Inventory_Management_Main.java`**:  
  Serves as the **entry point**, initializing the system and managing user interactions via a console-based menu.

- **`Layout.java`**:  
  Handles the structured design of the console menu and organizes formatted outputs for better user experience.

---

## ✨ Features

This project provides the following key functionalities:

1. **🔹 Add Product**:  
   Insert a new product into the inventory with attributes:
   - Product ID
   - Name
   - Quantity
   - Price

2. **🔹 Modify Product**:  
   Update any attribute of an existing product (ID, Name, Quantity, or Price).

3. **🔹 Delete Product**:  
   Remove an entry from the inventory based on its unique ID.

4. **🔹 Display Product List**:  
   Show all stored products in a **tabular format**, including their attributes.

5. **🔹 Search Product**:  
   Look up a product by its `ID` and display its details.

6. **🔹 Calculate Stock Value**:  
   Calculate and display the **total monetary value** of all items in stock.

---

## 🛠 Technologies Used

- **Programming Language**:
   - Java (JDK 11 or higher recommended)

- **Development Tools**:
   - IntelliJ IDEA (or any Java IDE of your choice)

---

## 📚 Examples

### Procedural Programming Implementation

The first version used **procedural programming** methods and static arrays for inventory management. Example workflows:

- **Adding a new product**:
   ```bash
   Enter Product ID: P001
   Enter Product Name: Laptop
   Enter Product Quantity: 10
   Enter Product Price: 1500.0
   ```

- **Displaying the product list**:
   ```bash
   | ID   | Name     | Quantity | Price   |
   |------|----------|----------|---------|
   | P001 | Laptop   | 10       | 1500.00 |
   ```

---

### Object-Oriented Programming Implementation

The **OOP refactor** introduced a modular design, using classes and objects for better flexibility and maintainability. Key changes include:

- Each product is an independent **object** stored in a dynamic **list**.
- Operations like adding, modifying, and deleting are managed through **methods** in the `App_Manager` class.
- Data outputs are organized through the `Layout` class for easier readability.

---

## 🚀 Future Enhancements

The project currently focuses on console-based functionality but can be expanded with the following features:

1. **Persistent Storage**:  
   Save and load inventory data persistently using **file storage** or a **relational database**.

2. **GUI Integration**:  
   Replace the console UI with a **Graphical User Interface (GUI)** using JavaFX or Swing for better usability.

3. **User Authentication**:  
   Implement **login and user roles** for secure access and privilege management.

4. **REST API**:  
   Expose inventory operations as **RESTful APIs** to enable external integration and broader application use.

5. **Advanced Error Handling**:  
   Add stricter **input validation** to prevent invalid entries (e.g., negative prices, invalid IDs, etc.).

---

## 🌟 Conclusion

The **Inventory Management System** illustrates
the transition from **procedural programming** to **object-oriented de sign**, showcasing best practices and concepts in Java development.
---

**Developed with 💻 in Java – Happy Coding!** 🚀