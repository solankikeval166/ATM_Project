import java.util.*;

public class Main_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account a = new Account();

        int id;
        System.out.print("Account ID: ");
        id = sc.nextInt();
        a.setAcc_Id(id);

        Date d1 = new Date();
        a.setDateCreated(d1);

        System.out.print("Account Balance: ");
        double bal = sc.nextDouble();
        a.setAcc_balance(bal);
        System.out.println("Date:" + a.getDateCreated());

        System.out.print("InterestRate: ");
        float rate = sc.nextFloat();
        a.setAnnualInterestRate(rate);
        System.out.println("You will get monthly interest " + a.getMonthlyInterest() + "\n");
        boolean st = true;
        while (st) {

            int choice;
            System.out.print("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Exit\nEnter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    a.checkBalance();
                }
                case 2 -> {
                    a.deposit();
                }
                case 3 -> {
                    a.withdraw();
                }
                case 4 -> {
                    st = false;
                }
                default -> {
                    System.out.println("Invalid Input !!!\n");
                }
            }
        }
        System.out.println("Thank You for using our service!!!");
    }
}
