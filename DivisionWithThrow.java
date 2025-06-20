package car;

class DivisionWithThrow {
    public static int divide(int num, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num / divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 2, 5, 1, 0};

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for (int i = 0; i < arr.length; i++) {
                try {
                    int result = divide(num, arr[i]);
                    System.out.println(num + " / " + arr[i] + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error at index " + i + ": " + e.getMessage());
                }
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        sc.close();
    }
}