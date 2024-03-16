package utils;
import java.util.ArrayList;

public class Major
{
    private ArrayList<String> majors = new ArrayList<>();


    public Major(String maj)
    {
        for(int i = 0; i < majors.size(); i++)
        {
            if(majors.get(i).equals(maj))
            {
                return;
            }
        }

        majors.add(maj);
    }

    public ArrayList<String> getMajors()
    {
        return majors;
    }
}