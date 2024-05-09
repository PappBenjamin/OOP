package oop.labor09.feladat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Felhasznalok
{

    private int counter; // csak arra kell, hogy allitgassak dolgokat
    private List<Felhasznalo> users = new ArrayList<>(); // felhasznalok listaja>

    public Felhasznalok() {
        this.counter = 0;
    }

    public boolean found(Felhasznalo user) {
        boolean found = false;
        for(Felhasznalo temp : users)
        {
            if(temp.getUsername().equals(user.getUsername()))
            {
                found = true;
                break;
            }
        }

        return found;
    }

    public void add(Felhasznalo user) {

        if(!found(user)) {
            this.users.add(user);
            System.out.println("OK");
        }
        else
        {

            while(found(user)) {
                counter++;

                user.setUsername(String.valueOf(counter));
            }

            users.add(user);
            System.out.println(user);

            counter = 0;
        }
    }

    public void readUsers(String file) {
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];

                add(new Felhasznalo(new Name(firstName, lastName)));

            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void printSize()
    {
        System.out.println(users.size());
    }

    public void printDiffrentUser() {
        int counter = 0;
        for(Felhasznalo user : users)
        {
            char temp = user.getUsername().charAt(user.getUsername().length() - 1);

            if(Character.isDigit(temp))
            {
                counter++;
            }
        }

        System.out.println(counter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Felhasznalo user : users)
        {
            sb.append(user).append(" ");
        }

        return sb.toString();
    }
}
