package com.oop.projects.ExceptionManagement.BankAccount;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

