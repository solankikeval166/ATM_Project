import java.util.*;
import java.util.ArrayList;
public class Account_3 {
    Scanner sc = new Scanner(System.in);
    public String accId;
    private long accBalance;

    Account_3(String accId) {
        this.accId = accId;
        accBalance = 300;
    }

    public void withdraw() {

        int amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = sc.nextInt();
        if (amount < accBalance - 300) {
            accBalance = accBalance - amount;
            System.out.println("Remaining Balance: " + accBalance + "₹\n");
        } else {
            System.out.println("Insufficient balance!!!\nThe minimum Balance of an account is 300₹.\n");
        }
    }

    public void deposit() {
        int amount;
        System.out.print("Enter amount to be deposit: ");
        amount = sc.nextInt();
        accBalance = accBalance + amount;
        System.out.println("Current Balance: " + accBalance + "₹\n");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + accBalance + "₹\n");
    }

    public void moneyTransfer(ArrayList ar) {
        int temp;
        String id;
        Account_3 ac = null;

        System.out.print("Money transfer Id:");
        id = sc.next();

        for (Object o : ar) {
            Account_3 a = (Account_3) o;
            if (id.equals(a.accId))
                ac = a;
        }

        if (ac == null)
            System.out.println("Invalid account id!!!\n");

        else {
            int amount;
            System.out.print("Enter amount to be transfer: ");
            amount = sc.nextInt();

            if (amount < accBalance - 300) {
                accBalance = accBalance - amount;
                System.out.println("Remaining Balance: " + accBalance + "₹\n");
                ac.accBalance = ac.accBalance + amount;
                System.out.println("Transaction successful!!!");
                System.out.println("Money transferred to " + ac.accId + ".\nUpdated Balance is " + ac.accBalance + "₹\n");
            } else {
                System.out.println("Insufficient balance!!!\nThe minimum Balance of an account is 300₹.\n");
            }

        }
    }

    public void createAccount(ArrayList arr) {
        String str;
        int bal;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        str = sc.next();
        System.out.print("Enter amount for initial balance:");
        bal = sc.nextInt();

        if (bal > 300) {
            Account_3 ac = new Account_3(str);
            ac.accBalance+=bal-300;
            arr.add(ac);
            System.out.println("Your account created successfully.\nThe Current balance is "+ac.accBalance+ "₹\n");
        } else {
            System.out.println("Account is not created the minimum amount of account is 300₹\n");
        }
    }

    void deleteAccount(ArrayList arr) {
        String str;
        Scanner sc = new Scanner(System.in);
        Account_3 ac = null;

        System.out.print("Enter ID :");
        str = sc.next();

        for (Object o : arr) {
            Account_3 a = (Account_3) o;
            if (str.equals(a.accId))
                ac = a;
        }

        if (ac == null)
            System.out.println("Account does not exists.\n");
        else {
            arr.remove(ac);
            System.out.println("Account deleted successfully!!!\n");
        }

    }
}
