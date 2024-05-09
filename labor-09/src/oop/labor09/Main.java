package oop.labor09;


import oop.labor09.feladat.Felhasznalok;
import oop.labor09.feladat1.SortingDemo;

public class Main {
    public static void main(String[] args)
    {
        SortingDemo p1 = new SortingDemo("fruits.txt");

        p1.sortReverseAlphabetically();
        System.out.print("Reverse: " );
        p1.printFruits();

        p1.sort();
        System.out.print("Normal: " );
        p1.printFruits();





    }
}
