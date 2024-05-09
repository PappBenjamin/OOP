package oop.labor09.feladat3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private String Name;

    public Company(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(String file) {
    }

    public void fire(int id) {
        employees.remove(id);
    }

    public void printAll(PrintStream out) {

        for (Employee temp : employees) {
            out.println(temp);
        }
    }

    public void printManager(PrintStream out) {
        for (Employee temp : employees) {
            if (temp instanceof Manager) {
                out.println(temp);
            }
        }
    }

    public int countTypes() {
        List<Class> classes = new ArrayList<>();

        for(Employee temp : employees)
        {
            Class classs = temp.getClass();

            if(!classes.contains(classs))
            {
                classes.add(classs);
            }
        }

        return classes.size();
    }

    public void sortByCompareator(Comparator<Employee> comparator)
    {
        Collections.sort(employees,comparator);
    }


}