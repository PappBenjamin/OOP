package models;

import enums.Major;

public class Student
{
    private String firstName;
    private String lastName;
    private String nepCode;
    public Major major;

    public Student(String nepC,String fName,String lName,Major maj)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.nepCode = nepC;
        this.major = maj;


    }

    public String getNepCode() {
        return nepCode;
    }

    public Major getMajor() {
        return major;
    }

    public String toString()
    {
        return "Student's name: " + lastName + " " + firstName + " Code: " + nepCode + " Maj: " + major;
    }
}
