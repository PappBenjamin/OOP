package lab4_3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray{

    private int length;
    private double array[];


    //------------------constructors--------------------------

    public MyArray(int length) {
        this.length = length;
        array = new double[length];
    }

    public MyArray(double[] Array) {
        array = Array.clone();
        length = Array.length;
    }

    public MyArray(MyArray Array) {
        array = Array.array.clone();
        length = Array.length;
    }

    public MyArray(String fileName) {
        try(Scanner scanner = new Scanner(new File(fileName)))
        {

            int scanLength = scanner.nextInt();
            this.length = scanLength;

            double scanArray[] = new double[scanLength];

            for(int i = 0; i < length; ++i)
            {
                scanArray[i] = scanner.nextDouble();
            }

            this.array = scanArray.clone();


        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    public void printArray() {

        for(int i = 0; i < this.array.length; ++i)
        {
            System.out.print(this.array[i] + " ");
        }

    }

    public void sortArray() {
        Arrays.sort(this.array);
    }

    public double mean() {
        double sum = 0;

        for (double elements : this.array) {
            sum += elements;
        }

        return sum / this.array.length;
    }

    public void fillArray(int low, int high) {
        for(int i = 0; i < array.length; ++i)
        {
            array[i] = Math.random() * (high - low + 1) + low;
        }
    }

}
