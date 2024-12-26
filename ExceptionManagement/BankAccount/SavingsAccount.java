package com.oop.projects.ExceptionManagement.BankAccount;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, String customerName, double interestRate) {
        super(accountNumber, balance, customerName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = this.getBalance() * this.interestRate / 100;
        this.deposit(interest);
        System.out.println("Interest Calculated");
    }


}
