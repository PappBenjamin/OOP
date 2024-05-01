package oop.labor08.masodik;

public interface IDictionary
{
    static final String DICTIONARY_FILE = "dic.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
