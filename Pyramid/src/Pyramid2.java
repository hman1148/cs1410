import java.util.Scanner;

public class Pyramid2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of rows: ");
        String userRows = input.next();

        String highestPower = String.valueOf(Math.pow(userRows.length() ,2));
        String format = "%" + (highestPower.length() + 1) + "s";

        for (int i = 1; i <= Integer.parseInt(userRows); i++) {
            for (int s = i; s <= Integer.parseInt(userRows); s++) {
                System.out.printf(format, "");;
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf(format, (int) Math.pow(2, k - 1));
            }
            for (int j = i - 1; j > 0 ; j--) {
                System.out.printf(format, (int) Math.pow(2, j - 1));
            }
            System.out.println(" ");
        }

    }

}
