package oop.labor08.masodik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary
{

    private ArrayList<String> words = new ArrayList<>();
    private ArrayListDictionary instance;

    public ArrayListDictionary() {
        try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE)))
        {
            while(scanner.hasNextLine())
            {
                String temp = scanner.nextLine();
                this.words.add(temp);
            }
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static IDictionary newInstance(){return null;}
    @Override
    public int size(){return this.words.size();}
    @Override
    public boolean add(String word){

        // Csak nem letezo szot teszunk be a szotarba
        // Ha binaris keresest akarunk, kell rendezni a tombot
        // Collections.sort(words); - rendezi az Arraylistet

        if(!this.words.contains(word))
        {
            this.words.add(word);
            Collections.sort(this.words);
            return true;
        }
        return false;
    }
    @Override
    public boolean find(String word){

        //method 1 return this.words.contains(word);

        //method 2
        int index = Collections.binarySearch(words, word);

        if(index >= 0)
        {
            return true;
        }
        return false;

    }


}
