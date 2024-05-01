package oop.labor05;
import lab5_2.Matrix;

public class Main
{
    public static void main(String[] args)
    {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };

        Matrix matrix1 = new Matrix(3,3);
        Matrix matrix2 = new Matrix(d);

        Matrix matrix3 = Matrix.add(matrix1,matrix2);
        //matrix3.printMatrix();

        Matrix matrix4 = Matrix.transpanent(matrix2);
        matrix4.printMatrix();

    }

}
