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

    @Override
    public String toString()
    {
        return year + "/" + month + "/" + day;
    }
}
