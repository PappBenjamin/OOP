package lab5_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;

        data = new double[rows][cols];
    }
    public Matrix(double[][] array) {
        this.rows = array.length;
        this.cols = array[0].length;

        this.data = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; ++j) {
                data[i][j] = array[i][j];
            }
        }
    }
    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
        this.cols = matrix.cols;

        this.data = new double[rows][cols];

        for(int i = 0; i < matrix.rows; ++i)
        {
            for(int j = 0; j < matrix.cols; ++j)
            {
                data[i][j] = matrix.data[i][j];
            }
        }
    }


    public int getRows() {
        return this.rows;
    }
    public int getCols() {
        return this.cols;
    }
    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.cols != m2.cols || m1.rows != m2.cols) {
            System.out.println("Wrong size");
            return null;
        }

        Matrix result = new Matrix(m1.rows, m2.cols);

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; ++j) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }

        }

        return result;
    }
    public static Matrix multiply(Matrix m1, Matrix m2) {
        if(m1.data[0].length != m2.data.length)
        {
            System.out.println("Invalid matrix size");
            return null;
        }

        Matrix m3 = new Matrix(m1.rows, m1.cols);
        m3.data = new double[m3.rows][m3.cols];

        for(int i = 0; i < m3.rows; ++i)
        {
            for(int j = 0; j < m3.cols; ++j)
            {
                for(int k = 0; k < m1.cols; ++k)
                {
                    m3.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }

        return m3;
    }

    public static Matrix transpanent(Matrix m1) {
        Matrix result = new Matrix(m1.cols, m1.rows);
        result.data = new double[m1.cols][m1.rows];

        for(int i = 0; i < m1.rows; ++i)
        {
            for(int j = 0; j < m1.cols; ++j)
            {
              result.data[j][i] = m1.data[i][j];
            }
        }
        return result;
    }

    public void fillMatrix(){
        Random random = new Random();

        for(int i = 0; i < rows; ++i)
        {
            for(int j = 0; j < cols; ++j)
            {
                data[i][j] = random.nextInt();
            }
        }

    }
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; ++j) {
                System.out.printf("%6.2f", data[i][j]);
            }
            System.out.println("\n");
        }
    }


}
