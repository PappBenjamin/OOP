package models;

import utils.Degree;
import utils.Department;

public class Teacher
{

    public String lastName;
    private String firstName;
    public Degree degree;
    public Department department;



    public Teacher(String fName, String lName, String deg, String dep)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.degree = new Degree(deg);
        this.department = new Department(dep);
    }

    public String toString(){
        return "Teacher's Name: " + lastName + " " + firstName + " Degree: " + degree.getDegrees() + " Department: " + department.getDepartments();
    }


}

