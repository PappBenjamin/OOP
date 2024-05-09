package oop.labor09.feladat3;

import oop.labor09.feladat2.MyDate;

public class Employee
{
    private  int ID;
    private final String FName;
    private String LName;

    private double salary;
    private final MyDate birthDate;
    private static int counter = 0;

    public Employee( String FName, String LName, double salary, MyDate birthDate) {
        this.FName = FName;
        this.LName = LName;
        this.salary = salary;
        this.birthDate = birthDate;
        ID = counter++;
    }

    public int getID() {
        return ID;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return ID + " " + FName + " " + LName + " " + salary + " " + birthDate;
    }
}
