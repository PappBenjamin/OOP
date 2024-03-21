package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("labor03");
    }
    public static void readFilePrintItsLineNumber(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Person> readFromCSVfile(String filename) {

        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("lab4_1_input.csv")))
        {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isEmpty())
                {
                    continue;
                }

                String[] items = line.split(",");

                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int birthYear = Integer.parseInt(items[2].trim());

                persons.add(new Person(firstName,lastName,birthYear));
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return persons;
    }
}

