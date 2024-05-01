package oop.labor06;

import java.util.ArrayList;

public class Restaurant
{
    private String nev;
    private MyDate alapitas;
    private ArrayList<Menuitem> Menuitems = new ArrayList<>();

    public Restaurant(String nev, int year, int month, int day) {
        this.nev = nev;
        this.alapitas = new MyDate(year,month,day);
    }

    public String getNev() {
        return this.nev;
    }
    public MyDate getAlapitas(){return this.alapitas;}

    public void addMenuItem(Menuitem menuitem) {
        for(int i = 0; i < this.Menuitems.size(); ++i)
        {
            if(this.Menuitems.get(i) == menuitem)
            {
                System.out.println("The menu is already inside");
                return;
            }
        }
        this.Menuitems.add(menuitem);
    }
    public void printMenu() {
        for(int i = 0; i < this.Menuitems.size(); ++i)
        {
            System.out.println(this.Menuitems.get(i));
        }
    }

    public double sumOfDrins() {
        double sum = 0;

        for(int i = 0; i < this.Menuitems.size(); ++i)
        {
            if(!this.Menuitems.get(i).getTipus())
            {
                sum += this.Menuitems.get(i).getEgysegar();
            }

        }

        return sum;
    }

    public void searchByName(String name) {
        for(int i = 0; i < this.Menuitems.size(); ++i)
        {
            if(this.Menuitems.get(i).getName().equals(name))
            {
                System.out.println("Item found\n");
                return;
            }
        }

        System.out.println("Item not found\n");

    }
}
