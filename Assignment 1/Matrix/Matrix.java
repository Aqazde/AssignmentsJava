import java.util.Scanner;
public class Matrix {
    public float[][] matrix;
    public int rows, columns;

    public void setMatrix(int numOfRows, int numOfColumns) {
        System.out.println("Enter matrix 3x3: ");
        Scanner user = new Scanner(System.in);
        this.rows = numOfRows;
        this.columns = numOfColumns;
        matrix = new float[numOfRows][numOfColumns];
        for(int i = 0; i < numOfRows; ++i) {
            for(int j = 0; j < numOfColumns; ++j) {
                matrix[i][j] = user.nextFloat();
            }
        }
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = new float[matrix.length][matrix[0].length];
        rows = matrix.length;
        columns = matrix[0].length;
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[0].length; ++j) {
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }

    public void addition(float[][] matrix) {
        if(this.matrix[0].length == matrix[0].length && this.matrix.length == matrix.length) {
            for(int i = 0; i < matrix.length; ++i) {
                for(int j = 0; j < matrix[0].length; ++j) {
                    this.matrix[i][j] += matrix[i][j];
                }
            }
        }
    }
    public void multiplication(int scalar) {
    }

    public float[][] getMatrix() {
        return matrix;
    }
    public void printout() {
        for(int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n \n");
    }

}