package oop.labor02.lab_01;

import java.sql.SQLOutput;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String Number, double Balance) {
        accountNumber = Number;
        balance = Balance;

    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > balance) {
            System.out.println("Error!");
        } else {
            balance -= amount;
        }
    }

    public void withdraw(double amount) {
        balance += amount;
    }


    @Override
    public String toString() {
        return accountNumber + ", " + balance;
    }
}

