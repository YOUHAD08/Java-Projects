package com.oop.projects.Exception_Management.BankAccount;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
