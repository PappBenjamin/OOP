package oop.labor03;

import lab4_3.MyArray;

import static lab4_1.Main.readFilePrintItsLineNumber;
import static lab4_1.Main.readFromCSVfile;
import static lab4_2.Main.readFiles;

public class Main
{
    public static void main(String[] args){

        //readFilePrintItsLineNumber("lab4_1_input.txt");]
        //System.out.println(readFromCSVfile("lab4_1_input.csv")); // feladat 1
        //System.out.print(readFiles("lab4_2_input.csv")); // feladat 2


        //----------------------FELADAT-3-----------------------

        MyArray array = new MyArray("data.txt");
        array.sortArray();
        array.printArray();
        System.out.println("\n");
        array.fillArray(5,10);
        array.printArray();








    }
}
