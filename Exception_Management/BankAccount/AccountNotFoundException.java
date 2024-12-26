package com.oop.projects.Exception_Management.BankAccount;

public class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

