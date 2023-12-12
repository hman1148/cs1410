import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterest = input.nextInt();
        System.out.print("Term (in years): ");
        int years = input.nextInt();
        System.out.print("Loan Amount: ");
        double amount = input.nextDouble();

        Loan loan = new Loan(annualInterest,years,amount);

        report(loan);

    }


    public static void report(Loan loan) {
        System.out.printf("Date of creation %s\n", loan.getDateCreated());
        System.out.printf("Monthly Payment: %.2f\n", loan.getMonthlyPayment());
        System.out.printf("Total Payment:   %.2f\n", loan.getTotalPayment());
    }
}