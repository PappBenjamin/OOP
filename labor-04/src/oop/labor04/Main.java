package oop.labor04;

import oop.labor01.MyDate;
import oop.labor04.model.Courses;
import oop.labor04.model.Student;
import oop.labor04.model.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Courses> readCourses(String filename) {
        ArrayList<Courses> courses = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] words = line.split(",");

                courses.add(new Courses(words[0],words[1],Integer.parseInt(words[2])));
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return courses;
    }
    private static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> students = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] words = line.split(",");

                students.add(new Student(words[0],words[1],words[2]));

            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return students;
    }

    public static void main(String[] args)
    {
        ArrayList<Courses> course1 = readCourses("lab4_courses");
        ArrayList<Student> student1 = readStudents("lab4_persons");

        ArrayList<Training> trainings = new ArrayList<>();

       for(int i = 0; i < course1.size(); ++i)
       {

           trainings.add(new Training(course1.get(i), Math.random() * (2000 - 1000 + 1) + 1000, new MyDate(2023, 3, 23), new MyDate(2023, 3,25)));

           for(int j = 0; j < 10; ++j)
           {
              trainings.get(i).enroll(student1.get((int) (Math.random() * (student1.size() - 1 + 1) + 0)));
           }
       }



       for(int i = 0; i < trainings.size(); ++i)
       {
           System.out.println(trainings.get(i));
       }


    }

}
