package oop.labor09.feladat3;

import oop.labor09.feladat2.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(String FName, String LName, double salary, MyDate birthDate, String department) {
        super(FName, LName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + department;
    }
}
