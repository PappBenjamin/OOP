package oop.labor01;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("Labor02_1:");

        BankAccount account1 = new BankAccount("OTP_1");
        System.out.print(account1.getAccountNumber() + " : " + account1.getBalance() + "\n");

        account1.deposit(1000);
        boolean result = account1.withdraw(500);

        if (!result) {
            System.out.println("You do not have sufficient funds for this operation!");
        } else {
            System.out.print(account1.getAccountNumber() + " : " + account1.getBalance() + "\n\n");
        }


        BankAccount account2 = new BankAccount("OTP_2");
        System.out.println(account2.getAccountNumber() + " : " + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountNumber() + " : " + account2.getBalance());


        //------------------------------------------------------------------


        System.out.println("\n" + "Labor02_2:");
        Rectangle[] rectangles = new Rectangle[10];

        Random rand = new Random();

        for (int i = 0; i < rectangles.length; ++i) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);

            rectangles[i] = new Rectangle(length, width);
            System.out.println("Length: " + rectangles[i].getLength() + "  Width: " + rectangles[i].getWidth() + "  Area: " + rectangles[i].getArea() + "  Perimeter: " + rectangles[i].getPerimeter());

        }


        //------------------------------------------------------------------


        System.out.println("\nLabor02_3:");
        DateUtil date_1 = new DateUtil(2022,2,23);
        System.out.print(date_1.getYear() + "." + date_1.getMonth() + "." +  date_1.getDay() + "\n");


        //------------------------------------------------------------------

        System.out.println("\nExtra:");

       File file = new File("/Users/macbook/Documents/INFO I . - második félév/OOP/labor-01/src/oop/labor01/movies.txt");
       Scanner scan = new Scanner(file);

       int counter = 0;
       FilmStore[] film = new FilmStore[100];

        while(scan.hasNextLine())
        {
            String[] wordsBackup = scan.nextLine().split(",");
            film[counter] = new FilmStore(wordsBackup[0],wordsBackup[1],wordsBackup[2],wordsBackup[3],wordsBackup[4]);
            counter++;
        }



        //----------------------RATING-SYSTEM-------------------------

        Scanner scanKeyboard = new Scanner(System.in);  //beolvasas

        System.out.print("\nDo you want to change the rating? (y/n) ");
        String answer = scanKeyboard.nextLine();

        if (answer.equals("y"))
        {
            System.out.print("Enter the movie's id number: ");
            int id = scanKeyboard.nextInt();

            if(id > counter - 1) // lekezelem azt, amikor meg nincs olyan film
            {
                System.out.print("Film not found");
                exit(-1);
            }

            System.out.print("Enter the new rating: (0 - 10)"); // lekezelem, mikor nem 0 - 10 kozott van az ertek
            double newRating = scanKeyboard.nextDouble();

            if(newRating < 0 || newRating > 10)
            {
                System.out.println("Rating invalid");
                exit(-1);
            }

            film[id].setRating(newRating);

            //Kiiratas
            FileWriter writer = new FileWriter("/Users/macbook/Documents/INFO I . - második félév/OOP/labor-01/src/oop/labor01/filmWithChangedRating.txt");
            writer.write(film[id].toString());
            writer.close();


        }

        if(answer.equals("n"))
        {
            System.out.print("Ok");
        }
        else
        {
            System.out.println("The system is accepting only y/n");

        }

        //-------------------ADD-MOVIE-------------------------

        if(counter < film.length)  // lekezeltem azt az esetet, amikor megtelt a filmek tombje
        {
                System.out.print("\nDo you want to add a film to the system? (y/n) ");
                answer = scanKeyboard.nextLine();

                if(answer.equals("y"))
                {
                System.out.print("Enter the name of the film:");
                String name = scanKeyboard.nextLine();

                System.out.print("Enter the director of the film:");
                String director = scanKeyboard.nextLine();

                System.out.print("Enter the release year of the film:");
                String year = scanKeyboard.nextLine();

                System.out.print("Enter the rating of the film:");
                String rating = scanKeyboard.nextLine();

                System.out.print("Enter the genre of the film:");
                String genre = scanKeyboard.nextLine();

                film[counter] = new FilmStore(name, director, year, rating, genre);
                counter++;

                System.out.print("*Film stored*");
                }


        }

        if(answer.equals("n"))
        {
            System.out.print("Ok");
        }
        else
        {
            System.out.println("The system is full or the answer is not y/n");
        }

        //------------------SEARCH-FUNCION-------------------------

        System.out.print("\nDo you want to search a movie? (y/n) ");
        answer = scanKeyboard.nextLine();

        if(answer.equals("n"))
        {
            System.out.print("Ok");
        }

        if(answer.equals("y"))
        {
            System.out.print("Do you want to search by title or by genre? (0/1)");
            int storeValue = scanKeyboard.nextInt();

            int movieCouter = 0; // lekezelem, mikor nem talal olyan filmet

            if(storeValue == 0)
            {
                System.out.print("Enter the title of the movie:");
                answer = scanKeyboard.nextLine(); // kiuriti a bufferbol a \n - t
                answer = scanKeyboard.nextLine();

                for(int i = 0; i < counter; ++i)
                {
                    if(answer.equals(film[i].getTitle()))
                    {
                       System.out.print("\n*Your film was found*" + film[i]);
                       movieCouter++;
                    }
                }
            }

            if(storeValue == 1)
            {
                System.out.print("Enter the genre of the movie:");
                answer = scanKeyboard.nextLine(); // kiuriti a bufferbol a \n - t
                answer = scanKeyboard.nextLine();

                for(int i = 0; i < counter; ++i)
                {
                    if(answer.equals(film[i].getGenre().toString()))
                    {
                       System.out.print("\n*Your film was found*" + film[i] + "\n");
                       movieCouter++;
                    }
                }

            }

            if(movieCouter == 0)
            {
                System.out.print("Film not found");
            }
        }
    }
}
