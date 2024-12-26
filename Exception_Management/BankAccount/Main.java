package com.oop.projects.Exception_Management.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> Bank_Account_list = new ArrayList<>();

        // My friend Bank Account  to make the transfer
        BankAccount My_friend_Bank_Account = new BankAccount("987654321",
                43,
                "Khalid");

        // My Account with overdraft limit
        CurrentAccount My_Current_Account = new CurrentAccount("1234567890",
                1234,
                "Ayoub Youhad",
                123);

        // My saving account with interest
        SavingsAccount My_Savings_Account = new SavingsAccount("1234567890123",
                1233,
                "Ayoub Youhad",
                3);

        // Adding Account to the list of bank account

        Bank_Account_list.add(My_friend_Bank_Account);
        Bank_Account_list.add(My_Current_Account);
        Bank_Account_list.add(My_Savings_Account);

        // get the balance of my account
        System.out.println("Balance: " + My_Current_Account.getBalance() + " € ");

        // withdrew from my  Current Account

        try {
            My_Current_Account.withdraw(123);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        // Generate interest
        My_Savings_Account.calculateInterest();
        System.out.println("Balance: " + My_Savings_Account.getBalance() + " € ");

        // Transfer Money from my current account to my friend account
        try {
            My_Current_Account.transfer(My_friend_Bank_Account, 300);
        } catch (AccountNotFoundException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Delete an account from the list of bank account
        Bank_Account_list.remove(My_friend_Bank_Account);

    }
}
