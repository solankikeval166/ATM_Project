import java.util.*;
import java.util.ArrayList;

public class ATM {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Account_3> user = new ArrayList<Account_3>();

        user.add(new Account_3("AC001"));
        user.add(new Account_3("AC002"));
        user.add(new Account_3("AC003"));
        user.add(new Account_3("AC004"));
        user.add(new Account_3("AC005"));
        user.add(new Account_3("AC006"));
        user.add(new Account_3("AC007"));
        user.add(new Account_3("AC008"));
        user.add(new Account_3("AC009"));
        user.add(new Account_3("AC010"));

        System.out.println(user);
        Account_3 temp = null;
        Account_3 ac = new Account_3(null);
        String s;
        System.out.print("Enter your ID:");
        s = sc.next();

        for (Account_3 account_3 : user) {
            temp = account_3;
            if (s.equals(temp.accId))
                ac = temp;
            else {
                System.out.println("Account does not exists");
                break;
            }
        }

        if(ac.accId == null)
        {
            System.out.println("Invalid ID!!!");
            System.out.println("You have to create an account.");
            ac.createAccount(user);
        }
        boolean st = true;
        while (st) {

            int choice;
            System.out.print("1.Check Balance\n2.Deposit\n3.Withdraw\n4.Money transfer\n5.Create an account\n6.Delete an account\n7.Exit\n\nEnter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    ac.checkBalance();
                }
                case 2 -> {
                    ac.deposit();
                }
                case 3 -> {
                    ac.withdraw();
                }
                case 4 -> {
                    ac.moneyTransfer(user);
                }
                case 5 -> {
                    ac.createAccount(user);
                }
                case 6 -> {
                    ac.deleteAccount(user);
                }
                case  7-> {
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
