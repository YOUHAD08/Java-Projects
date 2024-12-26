package com.oop.projects.ExceptionManagement.BankAccount;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
