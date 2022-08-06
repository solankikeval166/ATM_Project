import java.util.*;

public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 0;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    void getArea() {
        System.out.println("The area of circle is: " + (double) Math.PI * radius * radius);
    }

    void getPerimeter() {
        System.out.println("The Perimeter of circle is: " + (double) (2 * Math.PI * radius));
    }
}
