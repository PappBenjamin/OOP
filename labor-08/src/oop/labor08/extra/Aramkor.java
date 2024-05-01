package oop.labor08.extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aramkor
{
   private ArrayList<Alkatresz> alkatreszek;

   public Aramkor() {
        alkatreszek = new ArrayList<>();
   }

   public Aramkor(String textFile) {
       try( Scanner scanner = new Scanner(new File(textFile));)
       {

           alkatreszek = new ArrayList<>();

           while(scanner.hasNextLine())
           {
               String temp = scanner.nextLine();
               String[] words = temp.split(" ");

               switch(words[0])
               {
                   case "T":
                       alkatreszek.add(new Tranzisztor(Integer.parseInt(words[1]), words[2]));
                       break;
                   case "K":
                       alkatreszek.add(new Kondenzator(Integer.parseInt(words[1]), Integer.parseInt(words[2])));
                       break;
                   case "E":
                       alkatreszek.add(new Ellenallas(Integer.parseInt(words[1]), Integer.parseInt(words[2])));
                       break;

                   default:
                       break;
               }
           }
       }
       catch (FileNotFoundException e)
       {
           throw new RuntimeException(e);
       }

   }

   public int getNrOfAlkatreszek() {
       return alkatreszek.size();
   }

   public int getValueOfAlkatreszek() {
       int value = 0;
       for (Alkatresz alkatresz : alkatreszek) {
           value += alkatresz.ar;
       }
       return value;
   }

   public void addAlkatresz(Alkatresz alkatresz) {
       alkatreszek.add(alkatresz);
   }

   public void removeAlkatresz(Alkatresz alkatresz) {
       alkatreszek.remove(alkatresz);
   }

    public boolean keresAlkatresz(Alkatresz alkatresz) {
        if(alkatreszek.contains(alkatresz))
        {
            return true;
        }

        return false;
    }

    public boolean csakEllenallasok(){
        for(Alkatresz alkatresz : alkatreszek) {
            if(!(alkatresz instanceof Ellenallas))
            {
                return false;
            }
        }

        return true;
    }

    public double eredoEllenallas(){
        double osszegEllenallas = 0;

        if(this.csakEllenallasok())
        {
            for(int i = 0; i < this.alkatreszek.size(); ++i)
            {
                osszegEllenallas += ((Ellenallas)alkatreszek.get(i)).getErtek();
            }

            return osszegEllenallas;

        }
        else
        {
            System.out.println("Nem csak ellen. all\n");
            return -1;
        }
    }



    @Override
    public boolean equals(Object obj){
       if(((Aramkor)obj).getClass() == this.getClass() && ((Aramkor)obj).alkatreszek.size() == this.alkatreszek.size()) {
           for(Alkatresz alkatresz : this.alkatreszek) {
               if(!((Aramkor)obj).alkatreszek.contains(alkatresz))
               {
                   return false;
               }
           }
           return true;
       }

       return false;
    }

   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();

       for(Alkatresz alkatresz : alkatreszek) {
          sb.append("\t-" + alkatresz.toString() + "\n");
       }

       return "Áramkör ára: " + getValueOfAlkatreszek() + ", alkatrészek száma: " + getNrOfAlkatreszek() + "\nAlkatrészek:\n" + sb.toString();
   }



}
