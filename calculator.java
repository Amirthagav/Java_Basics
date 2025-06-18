package calculator;
import java.util.*;
public class Calculator {

    public int calculate(int a, int b, char operator) { 
        switch (operator) {
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    return "Division by zero is not allowed.";
                }
                return a / b;
            case '-':
                return a - b;
            case '+':
                return a + b;
            default:
                return "Invalid operator";
        }
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner sc = new Scanner();
        int x = sc.nextInt();
        int y = sc.nextInt();
        char a = sc.next();
        System.out.println(x +" " + a + " " + y + " " + myCalculator.calculate(x, y, a));
    }
}