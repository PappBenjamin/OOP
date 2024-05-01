package oop.labor08.extra;

public class Ellenallas extends Alkatresz
{
    private int ertek;

    public Ellenallas(int ar, int ertek) {
        super(ar);
        this.ertek = ertek;
    }

    public int getErtek() {
        return ertek;
    }

    @Override
    public String toString() {
        return "Ellenallas ára: " + ar + ", értéke: " + ertek;
    }

    @Override
    public boolean equals(Object obj){
        if(((Ellenallas)obj).getClass() == this.getClass())
        {
            return true;
        }
        return false;
    }


}
