package oop.labor10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream("result.txt");


        long start = System.currentTimeMillis();

        storage storage1 = new storage("data10.txt");
        storage1.NbOfUpdatedProducts("update10.txt");

        long stop = System.currentTimeMillis();
        long time = stop - start;

        out.println("Time in milisec: (data10) " + time);

        //---------------------------------------------

        start = System.currentTimeMillis();

        storage storage2 = new storage("data1000.txt");
        storage1.NbOfUpdatedProducts("update1000.txt");

        stop = System.currentTimeMillis();
        time = stop - start;

        out.println("Time in milisec: (data1000) " + time);

        //----------------------------------

        start = System.currentTimeMillis();

        storage storage3 = new storage("data10000.txt");
        storage1.NbOfUpdatedProducts("update10000.txt");

        stop = System.currentTimeMillis();
        time = stop - start;


        out.println("Time in milisec: (data10000) " + time);

        out.close();






    }
}
