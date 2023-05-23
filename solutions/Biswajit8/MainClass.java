package solutions.Biswajit8;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape (Triangle/Rectangle): ");
        String inputShape = sc.nextLine();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();

        Shape shape;
        if (inputShape.equalsIgnoreCase("Triangle")) {
            shape = new Triangle(h, w);
        } else {
            shape = new Rectangle(h, w);
        }

        printArea(shape);
    }

    private static void printArea(Shape shape) {
        System.out.println("Area = " + shape.compute_area());
    }
}
