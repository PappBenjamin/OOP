package models;

import java.util.Arrays;

public class Course {
    public static final int MAX_STUDENT = 120;

    public enum DayOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}


    private Teacher teacher;
    private String courseID;
    private int numberOfCredits;
    public int numberOfEnrolledStudents = 0;
    public static Student[] enrolledStudents = new Student[MAX_STUDENT];
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
        if (numberOfEnrolledStudents < MAX_STUDENT) {
            enrolledStudents[numberOfEnrolledStudents] = student;
            numberOfEnrolledStudents++;
        }
    }

    public Teacher getTeacher() {
        return this.teacher;
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
            sb.append(enrolledStudents[i]).append("\n\t\t");
        }


        return "Course: " + courseID + ":\n\tTeacher: " + teacher + "\n\tCredits: " + numberOfCredits + "\n\tOCCURS EVERY: " + dayOfCourse + "\n\tEnrolled Students: " + numberOfEnrolledStudents + "\n\t\t" + sb;
    }

}

