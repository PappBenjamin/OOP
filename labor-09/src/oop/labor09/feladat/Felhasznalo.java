package oop.labor09.feladat;

import oop.labor09.feladat.Name;

public class Felhasznalo
{
    private  String username;

    public Felhasznalo(Name name)
    {

        this.username = name.getFirstName() + name.getLastName();
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setUsername(String temp){this.username += temp;}


    @Override
    public String toString()
    {
        return username;
    }


}
