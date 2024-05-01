package oop.labor08.extra;

public class Kondenzator extends Alkatresz
{
    private int ertek;

    public Kondenzator(int ar, int ertek) {
        super(ar);
        this.ertek = ertek;
    }

    @Override
    public String toString() {
        return "Kondenzator ára: " + ar + ", értéke: " + ertek;
    }

    @Override
    public boolean equals(Object obj){
        if(((Kondenzator)obj).getClass() == this.getClass())
        {
            return true;
        }
        return false;
    }

}
