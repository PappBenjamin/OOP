package oop.labor06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Menuitem menu0 = new Menuitem("Almaleves",12.99,true);
        Menuitem menu1 = new Menuitem("Almafroccs",8.99,false);

        //System.out.println(menu0);
        //System.out.println(menu1);

        Restaurant restaurant = new Restaurant("Top1",1989,11,2);

        try(Scanner scanner = new Scanner(new File("menu.txt"))) {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] words = line.split(" ");

                if(Integer.parseInt(words[2].trim()) == 1)
                {
                    Menuitem temp = new Menuitem(words[0].trim(),Double.parseDouble(words[1].trim()),true);
                    restaurant.addMenuItem(temp);
                }
                else
                {
                    Menuitem temp = new Menuitem(words[0].trim(),Double.parseDouble(words[1].trim()),false);
                    restaurant.addMenuItem(temp);
                }
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        restaurant.printMenu();
        restaurant.searchByName("Korte");



    }
}
