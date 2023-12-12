import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");

        int ISBN = input.nextInt();

        // Find digits of ISBN
        int d1 = (ISBN) / (100000000);
        //2nd number
        int n1 = (ISBN) - (d1 * 100000000);
        int d2 = (n1) / (10000000);
        //3rd number
        int n2 = (n1) - (d2 * 10000000);
        int d3 = (n2) / (1000000);
        //4th number
        int n3 = (n2) - (d3 * 1000000);
        int d4 = (n3) / (100000);
        //5th number
        int n4 = (n3) - (d4 * 100000);
        int d5 = (n4) / (10000);
        //6th number
        int n5 = (n4) - (d5 * 10000);
        int d6 = (n5) / (1000);
        //7th number
        int n6 = (n5) - (d6 * 1000);
        int d7 = (n6) / (100);
        //8th number
        int n7 = (n6) - (d7 * 100);
        int d8 = (n7) / (10);
        //9th number
        int n8 = (n7) - (d8 * 10);
        int d9 = (n8) / (1);

        //Calculate check sum
        int checkSum = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % (11);

        // Check if checksum is 10 to add 'X'
        if (checkSum == 10) {
            System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6+ "" + d7 + "" + d8 + "" + d9 + "X");
        } else {
            System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6+ "" + d7 + "" + d8 + "" + d9  + "" + checkSum);
        }
    }

}
