package com.oop.projects.Exception_Management.BankAccount;

public class BankAccount {

    String accountNumber;
    double balance;
    String customerName;

    public BankAccount(String accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount > balance) {throw new InsufficientFundsException("Insufficient Funds ");}
        balance -= amount;
        System.out.println("Withdrawn amount: " + amount + " € ");
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited amount: " + amount + " € ");
    }

    public double getBalance(){
        return balance;
    }

    public void transfer(BankAccount target, double amount) throws InsufficientFundsException ,AccountNotFoundException {
        this.withdraw(amount);
        if (target==null)  {throw new AccountNotFoundException("Target Account is not found");}
        target.deposit(amount);
        System.out.println("Transferred amount: " + amount + " € ");
    }
}
