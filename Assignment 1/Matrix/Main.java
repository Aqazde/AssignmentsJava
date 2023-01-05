import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Matrix array = new Matrix();
        Matrix userArray = new Matrix();
        float[][] arr = {{1, 2, 3}, {3, 2, 1}, {2, 3, 1}};
        array.setMatrix(arr);
        System.out.println("Given matrix: ");
        array.printout();
        userArray.setMatrix(3,3);
        userArray.addition(array.getMatrix());
        userArray.printout();
        System.out.println("input number for scalar multiplication: ");
        Scanner scalar = new Scanner(System.in);

    }
}