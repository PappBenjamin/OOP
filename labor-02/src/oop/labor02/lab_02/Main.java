package oop.labor02.lab_02;

import oop.labor02.lab_01.BankAccount;
import oop.labor02.lab_02.Customer;

public class Main {
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("OTP00001",9.99);
        BankAccount account1 = new BankAccount("OTP00002",10);
        BankAccount account2 = new BankAccount("OTP00003",11);
        BankAccount account3 = new BankAccount("OTP00004",12);

        Customer customer1 = new Customer("John","BLACK");
        customer1.addAccount(account);
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addAccount(account3);

        System.out.println(customer1);

    }
}
