package oop.labor08;

import oop.labor08.elso.ArrayListQueue;
import oop.labor08.elso.CircularQueue;
import oop.labor08.elso.IQueue;

import oop.labor08.masodik.DictionaryService;
import oop.labor08.masodik.DictionaryType;

import oop.labor08.extra.Ellenallas;
import oop.labor08.extra.Kondenzator;
import oop.labor08.extra.Tranzisztor;
import oop.labor08.extra.Aramkor;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        IQueue q3 = new CircularQueue(3);
        IQueue q4 = new CircularQueue(5);

        for (int i = 1; i <= 3; ++i) {
            q3.enQueue(i);
            q4.enQueue(i);
        }

        System.out.println("Q3 equals Q4: " + q3.equals(q4) + "\n");


        //feladat 2

        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        boolean start = false; // if true, program will start
        while(start) {
            System.out.print("Word to find (Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")) {break;}
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        scanner.close();

        DictionaryService service2 = new DictionaryService(DictionaryType.ARRAY_LIST);
        //System.out.print("Words, those contain 'apple': ");
        //System.out.println( service2.findWordsFile( "apple"));

        //feladat extra

        Aramkor aramkor = new Aramkor();

        aramkor.addAlkatresz(new Tranzisztor(1000, "T1"));
        aramkor.addAlkatresz(new Tranzisztor(2000, "T2"));

        aramkor.addAlkatresz(new Kondenzator(2000, 10));
        aramkor.addAlkatresz(new Kondenzator(3000, 20));

        aramkor.addAlkatresz(new Ellenallas(2000, 5));
        aramkor.addAlkatresz(new Ellenallas(3000, 10));

        System.out.println(aramkor + "\n\n");

        Aramkor aramkorFile = new Aramkor("Aramkor.txt");
        System.out.println(aramkorFile);






    }


}
