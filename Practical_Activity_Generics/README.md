# Practical_Activity_Generics

The `Practical_Activity_Generics` project is a Java-based console application that provides a product management system. It allows users to perform various product-related operations such as adding, viewing, searching, and removing products. The project highlights programming concepts like Object-Oriented Programming (OOP), generics, and safe collection handling.

---

## Table of Contents
1. [Features](#features)
2. [How to Use the Project](#how-to-use-the-project)
    - [Prerequisites](#prerequisites)
    - [Running the Application](#running-the-application)
    - [Menu Options](#menu-options)
3. [Example Workflow](#example-workflow)
4. [Key Technical Details](#key-technical-details)
5. [Best Practices Highlighted](#best-practices-highlighted)
6. [Potential Enhancements](#potential-enhancements)
7. [Conclusion](#conclusion)

---

## Features
1. **Add Products**
    - Create and add products with details including:
        - ID
        - Name
        - Brand
        - Price
        - Description
        - Quantity

2. **View All Products**
    - Retrieve and display a list of all products stored in the system.

3. **Find Product by ID**
    - Search for a product in the list using a unique ID and display its details.

4. **Remove Product by ID**
    - Delete a product from the list using its ID.  
      *(Safe removal implemented with `products_list.iterator()` to prevent runtime issues.)*

5. **Interactive Menu**
    - A simple console-based menu system to guide the user through the available operations.

6. **Exit the System**
    - Cleanly exit the program when done.

---

## How to Use the Project

### Prerequisites
- **Java Version:** 11 or higher
- A Java IDE such as IntelliJ IDEA or the Java CLI environment.

### Running the Application
1. Download or clone the project source code.
2. Open the project inside your IDE (e.g., IntelliJ IDEA).
3. Locate the `App.java` file inside the `com.oop.projects.Practical_Activity_Generics` package.
4. Run the `App` class to start the application.

### Menu Options
The application operates through a menu presented to the user in the terminal. The options are as follows:
- `1` - **Add a Product:** Enter product details to add a new product.
- `2` - **Remove a Product:** Provide a product ID to remove a specific product from the list.
- `3` - **View All Products:** Display all existing products in the list.
- `4` - **Search for a Product:** Enter a product ID to retrieve its details.
- `H` - **Home Menu:** Redirect to the home screen.
- `E` - **Exit the Application:** Safely end the program.

---

## Example Workflow
1. **Adding a Product:**  
   Launch the program, choose option `1`, and input the requested details (ID, name, etc.). The product will be added to the list.

2. **Viewing All Products:**  
   Choose option `3` to display all the stored products, along with their details.

3. **Searching for a Product:**  
   Use option `4` and enter the unique ID of the product to find its details.

4. **Removing a Product:**  
   Select option `2` and provide the ID of the product to remove it. If the product is found, it'll be deleted safely.

---

## Key Technical Details
- **Core Data Structure:** `ArrayList` (to store products)
- **Generics:** Ensures type safety and flexibility
- **Iterators:** Used for safe modification of the list during iteration (avoiding the `ConcurrentModificationException` with `products_list.iterator()`).
- **User Input Handling:** Basic input-output is implemented using `Scanner` for interactive sessions.

---

## Best Practices Highlighted
- **Object-Oriented Programming (OOP):** Encapsulation, abstraction, and modular class design.
- **Safe Collection Handling:** Uses iterators to avoid common pitfalls like `ConcurrentModificationException` during list modification.
- **Console-Based Interaction:** A clear and user-friendly menu-driven program.

---

## Potential Enhancements
This project can be extended with additional features such as:
- Update an existing product’s details.
- Save and load products persistently using file storage or a database.
- Improve user input validation to ensure robust error handling.
- Add a more intuitive user interface (e.g., graphical or web-based).

---

## Conclusion
The `Practical_Activity_Generics` project demonstrates key Java concepts such as generics, collection handling, and OOP principles. It provides a solid foundation for building more complex applications and serves as an educational resource for beginners in Java programming.