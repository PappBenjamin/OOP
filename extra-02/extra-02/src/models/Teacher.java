package models;

import enums.Degree;
import enums.Department;
import enums.Major;

public class Teacher
{

    public String lastName;
    private String firstName;
    public Degree degree;
    public Department department;


    public Teacher(String fName,String lName, Degree deg, Department dep){
        this.firstName = fName;
        this.lastName = lName;
        this.degree = deg;
        this.department = dep;
    }

    public String toString(){
        return "Teacher's Name: " + lastName + " " + firstName + " Degree: " + degree + " Department: " + department;
    }


}

