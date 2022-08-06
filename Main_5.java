import java.util.*;

public class Main_5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double length,width;
        int choice;
        FindArea a = new FindArea();

        System.out.println("Enter radius of circle:");
        double radius =sc.nextDouble();
        System.out.println("The area of circle is " +a.area(radius));

        System.out.println("Enter the length:");
        length =sc.nextDouble();
        System.out.println("Enter the width:");
        width=sc.nextDouble();
        System.out.println("the area of Rectangle is "+a.area(length,width));
    }
}
