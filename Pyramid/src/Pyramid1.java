import java.util.Scanner;

public class Pyramid1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a amount of rows: ");
        String userRows = input.next();

        String format =  " " + "%" + userRows.length() + "s";

        for (int i = 1; i <= Integer.parseInt(userRows); i++) {
            for (int s = i; s <= Integer.parseInt(userRows); s++) {
                System.out.printf(format, "");;
            }
            for (int j = i; j > 0 ; j--) {
                System.out.printf(format, j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.printf(format, k);
            }
            System.out.println(" ");
        }

    }
}

