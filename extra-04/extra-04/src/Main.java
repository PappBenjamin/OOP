import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Library> readLibrary(String filename) {
        ArrayList<Library> Library = new ArrayList<>();
        int count = 0;

        try(Scanner scanner = new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] words = line.split(",");

                if(words[0].equals("LIBRARY"))
                {
                    Library.add(new Library(words[2],words[1]));
                }
                else
                {
                    if(words.length == 4)
                    {
                        Library.get(Library.size()-1).addBook(new Book(words[1],words[2],words[3]));
                    }

                }




            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return Library;
    }
    public static void printLibraries(ArrayList<Library> Library) {
        for(int i = 0; i < Library.size(); ++i)
        {
            try (FileWriter file = new FileWriter(Library.get(i).getName().replaceAll(" ", "_") + ".txt"))
            {
                file.write(String.valueOf(Library.get(i)));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    private static ArrayList<Person> readPerson(String filename) {
        ArrayList<Person> Person = new ArrayList<>();
        int count = 0;

        try(Scanner scanner = new Scanner(new File(filename)))
        {
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] words = line.split(",");

                if(words.length == 5 && DateUtil.isValidDate(Integer.parseInt(words[2]),Integer.parseInt(words[3]),Integer.parseInt(words[4])))
                {
                    Person.add(new Person(words[0],words[1],Integer.parseInt(words[2]),Integer.parseInt(words[3]),Integer.parseInt(words[4])));
                }
                else
                {
                    count++;
                }

            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        System.out.println("Invalid persons data: " + count + "\n");
        return Person;
    }
    public static ArrayList<Person> printPersons(ArrayList<Person> Person) {
        for(int i = 0; i < Person.size(); ++i)
        {
            System.out.println(Person.get(i));
        }

        return Person;
    }
    private static void readCheckouts(String filename, ArrayList<Person> Person, ArrayList<Library> Library) {

        try(Scanner scanner = new Scanner(new File(filename)))
        {
            int countInvalidPersons = 0;
            int countInvalidBooks = 0;
            int countReservedBooks = 0;

            while(scanner.hasNextLine())
            {
                boolean foundPerson = false;
                boolean foundBook = false;
                boolean reservedBook = false;

                String line = scanner.nextLine();
                String[] words = line.split(",");

                for(int i = 0; i < Person.size(); ++i)
                {
                    if(words[0].equals(Person.get(i).getId()))
                    {
                        foundPerson = true;

                        for(int j = 0; j < Library.size(); ++j)
                        {
                            for(int k = 0; k < Library.get(j).getBooks().size(); ++k)
                            {
                                if(Integer.parseInt(words[1]) == Library.get(j).getBooks().get(k).getId())
                                {
                                    foundBook = true;

                                    if(!Library.get(j).getBooks().get(k).isCheckedOut())
                                    {
                                        Person.get(i).borrowBook(Library.get(j).getBooks().get(k));
                                        reservedBook = true;
                                    }
                                }
                            }
                        }
                    }

                }

                if(!foundPerson) {
                    countInvalidPersons++;
                }

                if(!foundBook) {
                    countInvalidBooks++;
                }

                if(reservedBook) {

                    countReservedBooks++;
                }
            }

            System.out.println("Persons not found in our database: " + countInvalidPersons);
            System.out.println("Books not found in our database: " + countInvalidBooks);
            System.out.println("Books already reserved: " + countReservedBooks + "\n");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    private static void printCheckouts(ArrayList<Person> Person, ArrayList<Library> Library) {
        for(int i = 0; i < Person.size(); ++i)
        {
            if(!Person.get(i).getBooks().isEmpty())
            {
                System.out.print(Person.get(i).getLastName() + " " + Person.get(i).getFirstName() + " checked out these books:\n");

                for(int j = 0; j < Person.get(i).getBooks().size(); ++j)
                {
                    System.out.print("\t\t" + Person.get(i).getBooks().get(j));
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Library> Library = readLibrary("libraries.csv");
        //printLibraries(Library);

        ArrayList<Person> Person = readPerson("persons.csv");
        readCheckouts("checkout.csv",Person,Library);
        printPersons(Person);

        //printCheckouts(Person,Library);

    }

}