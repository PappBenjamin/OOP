
import utils.Degree;
import utils.Major;
import utils.Department;

import models.Course;
import models.Student;
import models.Teacher;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void enrolledStudentsByMajor(String major, String courseID, Course course) {

        System.out.println("Students by Major: " + major);

        for(int i = 0; i < course.numberOfEnrolledStudents; i++)
        {
            String SMajor = course.getStudent(i).major.getMajors().toString();

            if(SMajor.contains(major))
            {
                System.out.println(course.getStudent(i).toString());
            }
        }


    } // megvan

    public static Course[] coursesByTeacherDegree(String degree, Course[] course) {

        int countDocent = 0;

        for (Course value : course) {
            if (value.getTeacher().degree.getDegrees().toString().contains(degree)) {

                countDocent++;
            }
        }

        Course[] courseByDegree = new Course[countDocent];

        countDocent = 0;

        for (Course value : course) {
            if (value.getTeacher().degree.getDegrees().toString().contains(degree)) {
                courseByDegree[countDocent] = value;

                countDocent++;
            }
        }


        return courseByDegree;
    } // megvan

    public static int nrOfCoursesByDay(Course.DayOfWeek day, Course[] course) {
        int counterForDayOfCourse = 0;

        for (Course value : course) {
            if (value.getDayOfCourse().equals(day)) {
                counterForDayOfCourse++;
            }
        }

        return counterForDayOfCourse;
    } // megvan

    public static void cancelEnrollments(String fileName, Course[] course) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine())
        {
            String nepCode = scan.nextLine();

            for (int i = 0; i < course.length; ++i) {
                for (int j = 0; j < course[i].numberOfEnrolledStudents; ++j) {
                    if (course[i].getStudent(j).getNepCode().equals(nepCode))
                    {
                        course[i].setStudent(j,null);

                        for (int index = j; index < course[i].numberOfEnrolledStudents - 1; ++index)
                        {
                            course[i].setStudent(index,course[i].getStudent(index + 1));
                        }

                        course[i].numberOfEnrolledStudents--;
                    }
                }
            }
        }
    } //megvan



    public static void main(String[] args) throws FileNotFoundException{

        Student student1 = new Student("AVLMO7", "Anne", "Bell", "APPLIED_SOCIAL_SCIENCE");
        Student student2 = new Student("OXV8AQ", "Bob", "Carter", "Dentistry");
        Student student3 = new Student("CJQ5T9", "Cathy", "Davies", "Applied_Lingustic");

        //Teachers//

        Teacher teacher1 = new Teacher("Suzanne", "Grey","Docens","Medical");

        //Courses//

        Course course1 = new Course("MB_INFO20", 5, Course.DayOfWeek.FRIDAY);

        course1.addTeacher(teacher1);

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        //Test//

        //System.out.println(course1);
        //enrolledStudentsByMajor("Dentistry", "MB_INFO20", course1);

        //nrOfCoursesByDay(Course.DayOfWeek.FRIDAY, new Course[]{course1});

        //Course[] courseByDegree = coursesByTeacherDegree("Docens", new Course[]{course1});
        //System.out.println(Arrays.toString(courseByDegree));

        cancelEnrollments("/Users/macbook/Documents/INFO I . - második félév/OOP/extra-03/extra-03/cancellation.csv", new Course[]{course1});
        System.out.println(course1);







    }

}