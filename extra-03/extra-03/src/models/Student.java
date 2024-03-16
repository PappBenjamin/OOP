package models;

import utils.Major;

public class Student
{
    private String firstName;
    private String lastName;
    private String nepCode;
    public Major major;

    public Student(String nepC, String fName, String lName, String maj)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.nepCode = nepC;
        this.major = new Major(maj);


    }

    public String getNepCode() {
        return nepCode;
    }

    public Major getMajor() {
        return major;
    }

    public String toString()
    {
        return "Student's name: " + lastName + " " + firstName + " Code: " + nepCode + " Maj: " + major.getMajors();
    }
}
