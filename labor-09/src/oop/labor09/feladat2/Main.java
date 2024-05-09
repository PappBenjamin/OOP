package oop.labor09.feladat2;

import oop.labor09.feladat1.SortingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<MyDate> dates = new ArrayList<>();

        dates.add(new MyDate(2020, 1, 1));
        dates.add(new MyDate(2020, 2, 1));
        dates.add(new MyDate(2019, 3, 1));
        dates.add(new MyDate(2022, 4, 1));
        dates.add(new MyDate(2029, 5, 1));
        dates.add(new MyDate(2030, 6, 1));

        Collections.sort(dates);

       for(MyDate temp: dates)
       {
           System.out.println(temp);
       }
    }
}
