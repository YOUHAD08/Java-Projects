package com.oop.projects.Exception_Management.BankAccount;

public class CurrentAccount extends BankAccount{
    private double overdraft_limit;

    public CurrentAccount(String accountNumber, double balance, String customerName, double overdraft_limit) {
        super(accountNumber, balance, customerName);
        this.overdraft_limit = overdraft_limit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(this.getBalance() - amount < this.overdraft_limit)
            throw new InsufficientFundsException("Insufficient Funds with overdraft");
        super.withdraw(amount);
        System.out.println("Withdrawal Successful");
    }
}
