package oop.labor06;

public class MyDate
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
}
