package oop.labor01;

public class Rectangle
{
    private double length;
    private double width;

    public Rectangle(double yourLength, double yourWidth)
    {
        length = yourLength;
        width = yourWidth;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return(length * width);
    }

    public double getPerimeter()
    {
        return(length + width + length + width);
    }


}
