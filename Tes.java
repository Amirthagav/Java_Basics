package car;

public class Tes {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: Invalid index.");
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        System.out.println("Program continues after try-catch block.");
    }
}