package oop.labor08.extra;

public class Tranzisztor extends Alkatresz
{
    private String kod;

    public Tranzisztor(int ar, String kod) {
        super(ar);
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Tranzisztor ára: " + ar + ", kód: " + kod;
    }

    @Override
    public boolean equals(Object obj){
        if(((Tranzisztor)obj).getClass() == this.getClass())
        {
            return true;
        }
        return false;
    }
}
