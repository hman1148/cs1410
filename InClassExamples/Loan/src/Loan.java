import java.util.Date;
public class Loan {

    private double annualRate;
    private int loanTermYears;
    private double loanAmount;

    private Date dateCreated;

    public Loan(double annualRate, int loanTermYears, double loanAmount) {
        this.annualRate = annualRate;
        this.loanTermYears = loanTermYears;
        this.loanAmount = loanAmount;

        this.dateCreated = new Date();
    }


    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyPayment() {
        double monthlyRate = this.annualRate / 1200;

        return (this.loanAmount * monthlyRate) / (1 - (1 / Math.pow(1 + monthlyRate, this.loanTermYears * 12)));

    }

    public double getTotalPayment() {
        return this.getMonthlyPayment() * this.loanTermYears * 12;
    }

}
