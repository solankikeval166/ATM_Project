import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radii;
        System.out.print("Enter radius of circle: ");
        radii = sc.nextDouble();

        Circle c1 = new Circle();
        Circle c2 = new Circle(radii);

        c1.setRadius(10);
        c1.getArea();
        c1.getPerimeter();
        c2.getArea();
        c2.getPerimeter();
    }
}
