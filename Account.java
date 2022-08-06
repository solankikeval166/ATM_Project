import java.util.*;

public class Account {
    Scanner sc = new Scanner(System.in);
    private int acc_Id = 0;
    private double acc_balance = 500;

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }

    private Date dateCreated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    double annualInterestRate = 0.7;

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account() {

    }

    public Account(int acc_Id, double acc_balance) {
        this.acc_Id = acc_Id;
        this.acc_balance = acc_balance;
    }

    public double getMonthlyInterestRate() {
        return (double) (annualInterestRate / 12.0);
    }

    public double getMonthlyInterest() {
        return (double) ((acc_balance * getMonthlyInterestRate()) / 100);
    }

    public void withdraw() {

        int amount;
        System.out.print("Enter amount to be Withdrawn: ");
        amount = sc.nextInt();
        if (amount <= acc_balance) {
            acc_balance = acc_balance - amount;
            System.out.println("Remaining Balance: " + acc_balance + "\n");
        } else {
            System.out.println("Insufficient balance!!!\n");
        }
    }

    public void deposit() {
        int amount;
        System.out.print("Enter amount to be deposit: ");
        amount = sc.nextInt();
        acc_balance = acc_balance + amount;
        System.out.println("Current Balance: " + acc_balance + "\n");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + acc_balance + "\n");
    }
}
