package car;
import java.util.Scanner;
public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printIncreasingNumber(1, num);
	}
	public static void printIncreasingNumber(int c, int n) {
		System.out.println(c);
		if(c<n)
			printIncreasingNumber(c+1, n);
	}
}
