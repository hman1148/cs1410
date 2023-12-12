import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //prompt user
        System.out.print("Enter a, b, c: ");

        // Get user input
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // calculate the discriminant and quadratic roots
        double discriminant = (b * b) - (4 * a * c);

        double quadraticRoot1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
        double quadraticRoot2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);

        // statements to check if the discriminant was greater than, equal, or less than zero
        if (discriminant > 0) {
            System.out.println("There are two roots for the quadratic equation with these coefficients.");
            System.out.println("r1 = " + quadraticRoot1);
            System.out.println("r2 = " + quadraticRoot2);
        }
        if (discriminant == 0) {
            System.out.println("There is one root for the quadratic equation with these coefficients.");
            System.out.println("r1 = " + quadraticRoot1);
        }
        if (discriminant < 0) {
            System.out.println("There are no roots for the quadratic equation with these coefficients.");
        }

    }

}
