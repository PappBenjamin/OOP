package utils;
import java.util.ArrayList;

public class Degree {

    private ArrayList<String> degrees = new ArrayList<>();


    public Degree(String deg)
    {
        for(int i = 0; i < degrees.size(); i++)
        {
            if(degrees.get(i).equals(deg))
            {
                return;
            }
        }

        degrees.add(deg);
    }

    public ArrayList<String> getDegrees()
    {
        return degrees;
    }
}