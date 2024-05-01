package oop.labor08.masodik;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static oop.labor08.masodik.IDictionary.DICTIONARY_FILE;

public class DictionaryService {
    private IDictionary dictionary;
    public DictionaryService(DictionaryType type) {
        switch (type)
        {
            case ARRAY_LIST:
                dictionary = new ArrayListDictionary();
                break;
            case TREE_SET:
                //dictionary = new TreeSetDictionary();
                System.out.println("Not implemented yet");
                break;
            case HASH_SET:
                //dictionary = new HashSetDictionary();
                System.out.println("Not implemented yet");
                break;
        }
    }
    public boolean findWord(String word)
    {
        return dictionary.find(word);
    }
    public ArrayList<String> findWordsFile(String word) {
        ArrayList<String> words = new ArrayList<>();

        try
        {
            Scanner scanner = new Scanner(new File(DICTIONARY_FILE));

            while(scanner.hasNextLine())
            {
                String temp = scanner.nextLine();
                if(temp.contains(word))
                {
                    words.add(temp);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return words;
    }
}
