package oop.labor09.feladat2;

import java.util.Collections;

public class MyDate implements Comparable<MyDate>
{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }



    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    @Override
    public int compareTo(MyDate o) {
        if(this.year != o.year)
        {
            return this.year - o.year;
        }

        if(this.month != o.month)
        {
            return this.month - o.month;
        }

        if(this.day != o.day)
        {
            return this.day - o.day;
        }

        return 0;
        
    }
}
