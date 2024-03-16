package utils;
import java.util.ArrayList;

public class Department
{

    private ArrayList<String> departments = new ArrayList<>();


    public Department(String dep)
    {
        for(int i = 0; i < departments.size(); i++)
        {
            if(departments.get(i).equals(dep))
            {
                return;
            }
        }

        departments.add(dep);
    }

    public ArrayList<String> getDepartments()
    {
        return departments;
    }


}