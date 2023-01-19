import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        int a = cout.nextInt();
        int b = cout.nextInt();
        recursive(a, b);
    }
    public static void recursive(int a, int b) {
        if(a > b) {
            System.out.println(a--);
        }
        else if(a < b) {
            System.out.println(a++);
        }
        else {
            System.out.println(a);
            return;
        }
        recursive(a, b);
    }
}