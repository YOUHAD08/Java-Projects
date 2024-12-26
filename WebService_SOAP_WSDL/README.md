# 🏦 Bank Web Service Project

This project demonstrates a **SOAP-based web service** for banking operations, developed using **JAX-WS**. The service provides functionalities such as **currency conversion** and **account management**, tested with **SoapUI**, and includes a client application for service interaction.

---

## 📚 Table of Contents

1. [📖 Introduction](#-introduction)
2. [🏗 Project Structure](#-project-structure)
3. [💻 Web Service Implementation](#-web-service-implementation)
   - [Currency Conversion Operation](#currency-conversion-operation)
   - [Account Retrieval Operations](#account-retrieval-operations)
4. [🧪 Testing with SoapUI](#-testing-with-soapui)
5. [🖥 Client Application](#-client-application)

---

## 📖 Introduction

The **Bank Web Service** project is a classroom implementation of a SOAP-based web service leveraging **JAX-WS**. It demonstrates the development of bank-related operations, such as:

- **Currency Conversion**: Convert Euro to Moroccan Dirhams (DH) using a fixed exchange rate.
- **Account Management**: Retrieve bank account details and lists.

Testing is conducted through **SoapUI**, and the project includes a client application to interact with the web service.

---

## 🏗 Project Structure

The project contains the following key components:

- **SOAP Web Service**: Implements core operations like currency conversion and account queries.
- **SoapUI Tests**: Validates the service using SOAP-based test cases.
- **Client Application**: Provides a consumer-facing implementation to interact with the web service.

<img src="WebServiceImage/Project Structure.png" alt="Project Structure" width="600">

---

## 💻 Web Service Implementation

The **`BankService`** class defines the web service with the following key operations:

<img src="WebServiceImage/WebService.png" alt="Web Service Diagram" width="600">

### ⚖️ Currency Conversion Operation

- **Method**: `Currency_Change(amount_in_euro)`
- **Description**: Converts an input amount from Euros (€) to Moroccan Dirhams (DH) using a fixed exchange rate.

**Sample Input**: `amount_in_euro = 100`  
**Sample Output**: `amount_in_dirhams = 1085`

---

### 📂 Account Retrieval Operations

1. **`Get_Account(bankId)`**
   - Fetches details of an account associated with a given **bankId**.
   - Example Use Case: Retrieve specific user bank account data.

2. **`Get_Accounts()`**
   - Retrieves a list of all bank accounts.
   - Example Use Case: Display all available accounts in the system.

---

## 🧪 Testing with SoapUI

The following operations were tested using **SoapUI**. See the sample screenshots below:

### 📍 Test `Currency_Change` Method

<img src="WebServiceImage/SOAPUI Test_1.png" alt="Testing Currency Conversion with SoapUI" width="600">

---

### 📍 Test `Get_Account` Method

<img src="WebServiceImage/SOAPUI Test_2.png" alt="Testing Account Retrieval with SoapUI" width="600">

---

### 📍 Test `Get_Accounts` Method

<img src="WebServiceImage/SOAPUI Test_3.png" alt="Testing All Accounts Retrieval with SoapUI" width="600">

---

## 🖥 Client Application

The client application interacts with the web service, enabling real-time testing of core operations like currency conversion and account data retrieval.

### 📂 Example Test: Client Interaction

<img src="WebServiceImage/Client_1 Test.png" alt="Client Application Test Screenshot" width="600">

---

## 👨‍💻 Getting Started

### 📦 Prerequisites

Ensure the following tools/environments are installed:

- **Java JDK 8 or Higher**: For compiling and running the project.
- **JAX-WS Library**: To build and deploy the SOAP-based service.
- **SoapUI** (or alternative): For testing the SOAP operations.
- **IDE** (e.g., IntelliJ IDEA, Eclipse): To work with the source code.

### ⚡ Setup Steps

1. Clone the repository and navigate to the project root:
   ```bash
   git clone https://github.com/your-repository-link
   cd BankWebServiceProject
   ```

2. Build and deploy the SOAP web service:
   - Use your IDE or Apache Tomcat/GlassFish.

3. Use SoapUI to test the WSDL file endpoints:
   - Import the WSDL into SoapUI and configure the request payloads.

4. Run the client application (`Main.java`) to test the operations programmatically.

---

## 📝 Notes

- All responses are XML-based, as per the SOAP protocol.
- Ensure the web service endpoint is running locally before executing the client application.
- Currency exchange rates are hardcoded for demo purposes.

---

## 🌟 Contribution

Contributions and suggestions are welcome! If you find issues or have ideas for improvement:

- Fork the repository
- Open a Pull Request (PR)
- Create an issue with relevant details

---

## 📜 License

This project is licensed under the **MIT License**. You are free to use, modify, and distribute the code for educational and personal projects.

---

**Developed with 💻 and ☕ in Java**