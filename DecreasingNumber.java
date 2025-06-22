package car;
import java.util.Scanner;
public class DecreasingNumber {
	public static void main(String [] arg) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printDecreasingNumber(num);
	}
	public static void printDecreasingNumber(int n) {
		System.out.println(n);
		if(n != 0) {
			printDecreasingNumber(n-1);
		}
	}
}
