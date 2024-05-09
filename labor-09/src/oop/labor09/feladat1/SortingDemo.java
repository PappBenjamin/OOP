package oop.labor09.feladat1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SortingDemo {

    private List<String> fruits = new ArrayList<>();
    public SortingDemo(String file) {
        try
        {
            Scanner scanner = new Scanner(new File("fruits.txt"));

            while(scanner.hasNextLine())
            {
                String temp = scanner.nextLine();
                fruits.add(temp);
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void printFruits() {
        System.out.println(fruits);
    }

    public void sort() {
        Collections.sort(this.fruits);
    }

    public void sortReverseAlphabetically() {
        Collections.sort(this.fruits,Collections.reverseOrder());
    }


}
