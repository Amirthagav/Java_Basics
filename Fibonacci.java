package car;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        } else if (n == 1) {
            return 1; 
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}