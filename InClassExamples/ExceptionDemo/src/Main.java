import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            System.out.printf("%d / %d = %d", number1, number2, quotient(number1, number2));
        } catch (ArithmeticException e) {
            System.out.printf("Error occurred, %s", e.getMessage());
        }
    }

    public static int quotient(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Divisor cannot be 0");
        }
    }
}