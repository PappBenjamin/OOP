package oop.labor01;

public class DateUtil
{
    private int year;
    private int month;
    private int day;

    public DateUtil(int yourYear, int yourMonth, int yourDay) {

        if(isValidDate(yourYear, yourMonth, yourDay))
        {
            year = yourYear;
            month = yourMonth;
            day = yourDay;
        }
        else
        {
            System.out.println("Invalid date :c");
        }
    }

    public int getYear()
    {
        return year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }

    public static boolean leapYear(int year) {
        if(year % 4 == 0 && (year % 100 != 0))
        {
            return true;
        }

        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
        {
            return true;
        }

        return false;
    }
    public static boolean isValidDate(int year, int month, int day) {

        //februar
        if(month == 2 && day >= 30)
        {
            return false;
        }

        //aprilis
        if(month == 4 && day > 30)
        {
            return false;
        }

        //junius
        if(month == 6 && day > 30)
        {
            return false;
        }


        //szeptember
        if(month == 9 && day > 30)
        {
            return false;
        }

        //november
        if(month == 11 && day > 30)
        {
            return false;
        }

        if(month > 12 || month < 1 || day > 31 || day < 1 || year <= 0)
        {
            return false;
        }

        return true;
    }


}
