package solutions.osoiri;

import java.util.Scanner;

public class Base {

    static void printArea(Shape shape) {
        System.out.println("Area is " + shape.compute_area());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Shape Choice");
        String input = in.next();
        System.out.println("Enter area");
        System.out.print("Height: ");
        double h = in.nextDouble();
        System.out.print("Width: ");
        double w = in.nextDouble();

        Shape shape;
        if ("Triangle".equals(input)) {
            shape = new Triangle(h, w);
        } else {
            shape = new Rectangle(h, w);
        }

        printArea(shape);
    }
}
