package oop.labor04.model;

public class Student
{
    private String id;
    private String FName;
    private String Lname;

    public Student(String ID, String FNAME, String LNAME)
    {
        this.id = ID;
        this.FName = FNAME;
        this.Lname = LNAME;
    }

    public String getFName() {
        return FName;
    }
    public String getLname() {
        return Lname;
    }
    public String getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return "Student{" + " ID: " + id +" Name:" + Lname + FName  + " }";
    }
}
