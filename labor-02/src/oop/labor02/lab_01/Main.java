package oop.labor02.lab_01;

public class Main {


    public static void main(String[] args)
    {
        BankAccount account = new BankAccount("OTP00001",9.99);
        Customer customer1 = new Customer("John","BLACK");
        customer1.setAccount(account);
        System.out.print(customer1);

        BankAccount account1 = new BankAccount("OTP00002",10);
        Customer customer2 = new Customer("Mary","WHITE");
        customer2.setAccount(account1);
        System.out.print(customer2);





    }
}
