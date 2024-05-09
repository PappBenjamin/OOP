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

        out.println("Filename: data10.txt " + " Updates: update10.txt " + " Time in milisec: " + time);

        //---------------------------------------------

        start = System.currentTimeMillis();

        storage storage2 = new storage("data1000.txt");
        storage1.NbOfUpdatedProducts("update1000.txt");

        stop = System.currentTimeMillis();
        time = stop - start;

        out.println("Filename: data1000.txt " + " Updates: update1000.txt " + " Time in milisec: " + time);

        //----------------------------------

        start = System.currentTimeMillis();

        storage storage3 = new storage("data10000.txt");
        storage1.NbOfUpdatedProducts("update10000.txt");

        stop = System.currentTimeMillis();
        time = stop - start;

        out.println("Filename: data10000.txt " + " Updates: update10000.txt " + " Time in milisec: " + time);
        //----------------------------------

        start = System.currentTimeMillis();

        storage storage4 = new storage("data100000.txt");
        storage1.NbOfUpdatedProducts("update100000.txt");

        stop = System.currentTimeMillis();
        time = stop - start;

        out.println("Filename: data100000.txt " + " Updates: update100000.txt " + " Time in milisec: " + time);

        //----------------------------------

        out.close();






    }
}
