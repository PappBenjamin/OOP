package oop.labor04.model;

public class Courses
{
    private String name;
    private String description;
    private int numHours;

    public Courses(String NAME, String DESC, int NUM)
    {
        this.name = NAME;
        this.description = DESC;
        this.numHours = NUM;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getNumHours(){return numHours;}

    @Override

    public String toString()
    {
        return "Course{name = " + name + ", description = " + description + ", NumHours = " + numHours +"}";
    }
}
