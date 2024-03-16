package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {

    public enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}


    private Teacher teacher;
    private String courseID;
    private int numberOfCredits;
    public int numberOfEnrolledStudents = 0;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private DayOfWeek dayOfCourse;

    public Course(String courseID, int numberOfCredits, DayOfWeek dayOfCourse) {
        this.courseID = courseID;
        this.numberOfCredits = numberOfCredits;
        this.dayOfCourse = dayOfCourse;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {

        enrolledStudents.add(student);
        numberOfEnrolledStudents++;
    }

    public void setStudent(int index, Student student)
    {
        enrolledStudents.set(index, student);
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Student getStudent(int index){

        return enrolledStudents.get(index);
    }

    public String getCourseID() {
        return this.courseID;
    }

    public DayOfWeek getDayOfCourse() {
        return this.dayOfCourse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numberOfEnrolledStudents; ++i)
        {
            sb.append(enrolledStudents.get(i).toString()).append("\n\t\t");
        }


        return "Course: " + courseID + ":\n\tTeacher: " + teacher + "\n\tCredits: " + numberOfCredits + "\n\tOCCURS EVERY: " + dayOfCourse + "\n\tEnrolled Students: " + numberOfEnrolledStudents + "\n\t\t" + sb;
    }

}

