package oop.labor04.model;
import oop.labor01.MyDate;

import java.util.ArrayList;

public class Training
{
    private Courses course;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();
    private double pricePerStudent;
    private MyDate startDate;
    private MyDate endDate;

    public Training(Courses course, double pricePerStudent, MyDate startDate, MyDate endDate)
    {
        this.course = course;
        this.pricePerStudent = pricePerStudent;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean enroll(Student student) {
        for(int i = 0; i < enrolledStudents.size(); ++i)
        {
            if(enrolledStudents.get(i).equals(student))
            {
                return true;
            }
        }

        enrolledStudents.add(student);
        return false;
    }
    public Student findByStudentId(String id) {
        for(int i = 0; i < enrolledStudents.size(); ++i)
        {
            if(enrolledStudents.get(i).getId().equals(id))
            {
                System.out.println("Student found!\n");
                return enrolledStudents.get(i);
            }
        }

        System.out.println("Student not found!\n");
        return null;
    }
    public Courses getCourse() {
        return course;
    }
    public int numEnrolled()
    {
        return enrolledStudents.size();
    }
    public void unEnrolled(String id) {
        if(findByStudentId(id) != null)
        {
            enrolledStudents.remove(findByStudentId(id));
        }

    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Training\n{\n\t").append(course).append("\n\tstartDate = ").append(startDate).append("\n\tendDate = ").append(endDate).append("\n");

        for(int i = 0; i < enrolledStudents.size(); ++i)
        {
            sb.append("\t\t");
            sb.append(enrolledStudents.get(i));
            sb.append("\n");
        }

        sb.append("}\n");

        return String.valueOf(sb);
    }
}
