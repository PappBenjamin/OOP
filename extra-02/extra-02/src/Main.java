import enums.Degree;
import enums.Department;
import enums.Major;
import models.Course;
import models.Student;
import models.Teacher;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void enrolledStudentsByMajor(Major major, String courseID, Course[] course) {

        System.out.println("Students by Major: " + major);

        for (Course value : course) {
            if (value.getCourseID().equals(courseID)) {
                for (int j = 0; j < value.numberOfEnrolledStudents; j++) {
                    if (Course.enrolledStudents[j].major.equals(major)) {
                        System.out.println(Course.enrolledStudents[j]);
                    }
                }
            }
        }
    } // megvan

    public static Course[] coursesByTeacherDegree(Degree degree, Course[] course) {

        int countDocent = 0;

        for (Course value : course) {
            if (value.getTeacher().degree.equals(degree)) {

                countDocent++;
            }
        }

        Course[] courseByDegree = new Course[countDocent];

        countDocent = 0;

        for (Course value : course) {
            if (value.getTeacher().degree.equals(degree)) {
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

            for (Course value : course) {
                for (int j = 0; j < value.numberOfEnrolledStudents; ++j) {
                    if (Course.enrolledStudents[j].getNepCode().equals(nepCode)) {
                        for (int index = j; index < course[j].numberOfEnrolledStudents - 1; ++index) {
                            Course.enrolledStudents[index] = Course.enrolledStudents[index + 1];
                        }

                        course[j].numberOfEnrolledStudents--;
                    }
                }

                System.out.println(value);
            }
        }
    } //megvan






    public static void main(String[] args) throws FileNotFoundException {
        Student student1 = new Student("Bell", "Anne", "AVLMO7", Major.INFORMATION_SCIENCE);
        Teacher teacher1 = new Teacher("Suzanne", "Grey", Degree.DOCENT, Department.MATHEMATICS_INFORMATICS);

        //System.out.println(student1);
        //System.out.println(teacher1);

        //Course course1 = new Course("MB_INFO20", 5, Course.DayOfWeek.FRIDAY);
        //course1.addTeacher(teacher1);
        //course1.addStudent(student1);

        // System.out.println(course1);

        //-------------------------TESZT-VEGE----------------------------



        File file = new File("/Users/macbook/Documents/INFO I . - második félév/OOP/extra-02/extra-02/university.csv");
        Scanner scan = new Scanner(file);

        int numberOfCourses = 0;
        Course[] course = new Course[50];

        int numberOfTeachers = 0;
        Teacher[] teacher = new Teacher[50];

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] parts = line.split(",");

            course[numberOfCourses] = new Course(parts[0], Integer.parseInt(parts[1]), Course.DayOfWeek.values()[Integer.parseInt(parts[2])]);

            line = scan.nextLine();
            parts = line.split(",");

            teacher[numberOfTeachers] = new Teacher(parts[0], parts[1], Degree.valueOf(parts[2]), Department.values()[Integer.parseInt(parts[3])]);

            course[numberOfCourses].addTeacher(teacher[numberOfTeachers]);


            numberOfCourses++;
            numberOfTeachers++;
        }



        //-------------------------COURSE-ES-TEACHER-HOZZAADVA--------------------------


        File file1 = new File("/Users/macbook/Documents/INFO I . - második félév/OOP/extra-02/extra-02/students.csv");
        Scanner scan1 = new Scanner(file1);

        Student[] student = new Student[50];
        int counterForStudents = 0;

        while (scan1.hasNextLine()) {
            String line = scan1.nextLine();
            String[] parts = line.split(",");

            student[counterForStudents] = new Student(parts[0], parts[1], parts[2], Major.valueOf(parts[3])); //eddig sikeres, esután valahol elmegy


            line = scan1.nextLine();
            parts = line.split(",");


            for(int j = 0; j < parts.length;++j){
                for (int i = 0; i < numberOfCourses; i++) {

                    if (parts[j].equals(course[i].getCourseID()))
                    {
                        course[i].addStudent(student[counterForStudents]);
                    }
                }
            }

            counterForStudents++;
        }

        for(int i = 0; i < numberOfCourses;++i)
        {
            System.out.println(course[i] + "\n\n");
        }

        //enrolledStudentsByMajor(Major.INFORMATION_SCIENCE, "OSX7G", course);

        //System.out.println(Arrays.toString(coursesByTeacherDegree(Degree.DOCENT, course)));

        //System.out.println(nrOfCoursesByDay(Course.DayOfWeek.FRIDAY,course));

        //cancelEnrollments("/Users/macbook/Documents/INFO I . - második félév/OOP/extra-02/extra-02/cancellation.csv",course);;



    }

}