package oop.labor01;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day)
    {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    @Override
    public String toString()
    {
        return "year: " + year + " month: " + month + " day: " + day;
    }
}
