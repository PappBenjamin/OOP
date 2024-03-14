package oop.labor01;

public class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String number)
    {
        accountNumber = number;
        balance = 0.0;

    }



    public String getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }

}
