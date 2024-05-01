package lab5_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
       BankAccount account1 = new BankAccount(500);
       Customer customer1 = new Customer("Papp","Benjamin");
       customer1.addAccount(account1);

       System.out.println(customer1);


    }
}
