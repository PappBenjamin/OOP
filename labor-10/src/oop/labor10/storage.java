package oop.labor10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class storage
{
    private List<product> list1 = new ArrayList<>();

    public storage(String fileName) {
        try(Scanner scanner = new Scanner(new File(fileName)))
        {
            while(scanner.hasNextLine())
            {
                String temp = scanner.nextLine();
                String[] word = temp.split(" ");

                product newProduct = new product(Integer.parseInt(word[0].trim()),word[1].trim(),Integer.parseInt(word[2].trim()),Integer.parseInt(word[0].trim()));
                list1.add(newProduct);
            }

            Collections.sort(list1);

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }

    public int NbOfUpdatedProducts(String file) {
        int counter = 0;

        try(Scanner scanner = new Scanner(new File(file)))
        {
            while(scanner.hasNextLine())
            {
                String temp = scanner.nextLine();
                String[] word = temp.split(" ");

                int index = Collections.binarySearch(list1, new product(Integer.parseInt(word[0]),"mindegy",0,0));

                if( index >= 0)
                {
                    list1.get(index).increaseAmount(Integer.parseInt(word[1]));
                    counter++;
                }
            }

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        return counter;
    }



    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        for(product temp: list1)
        {
            sb.append(temp + "\n");
        }

        return sb.toString();
    }
}
