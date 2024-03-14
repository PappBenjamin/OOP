package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static ArrayList<Customer> readFiles(String filename)
    {
        ArrayList<Customer> customers = new ArrayList<>();

        try
        {
            Scanner scanner = new Scanner(new File(filename));
            int index = 0;

            while(scanner.hasNextLine())
            {


                String line = scanner.nextLine();

                if(line.isEmpty())
                {
                    continue;
                }

                String[] items = line.split(",");

                if(items[0].trim().equals("Customer"))
                {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();

                    customers.add(new Customer(firstName,lastName));

                    index++;
                }

                if(items[0].trim().equals("Account"))
                {
                        String account = items[1].trim();
                        int amount = Integer.parseInt(items[2].trim());
                        customers.get(index - 1).addAccount(new BankAccount(account,amount));
                }


            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return customers;
    }
}
