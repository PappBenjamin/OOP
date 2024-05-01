package oop.labor06;

public class Menuitem
{
    private String nev;
    private double egysegar;
    private boolean tipus;

    public Menuitem(String nev, double egysegar, boolean tipus)
    {
        this.nev = nev;
        this.egysegar = egysegar;
        this.tipus = tipus;
    }

    public String getName()
    {
        return this.nev;
    }
    public double getEgysegar(){return this.egysegar;}
    public boolean getTipus(){return this.tipus;}

    public String toString()
    {
        String temp = "\0";

        if(this.tipus)
        {
            temp = "ennivaló";
        }
        else
        {
            temp = "innivaló";
        }

       return this.nev + "(" + temp + "), " + this.egysegar + "RON";
    }
}
