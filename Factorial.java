package car;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int f = factorial(n);
		System.out.print("Factorial of the number: " + f);
		
	}
	public static int factorial(int n) {
		if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);        }
	}
}
