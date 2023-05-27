package solutions.kaviyarasans;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Shape like 'Triangle' or 'Rectangle' to calculate Area :");
        String input = scanner.next();
        System.out.println("Enter the height :");
        double h = scanner.nextDouble();
        System.out.println("Enter the width :");
        double w = scanner.nextDouble();

        Shape shape;
        if (input.equals("Triangle")) {
            shape = new Triangle(h, w);
        } else {
            shape = new Rectangle(h, w);
        }

        printArea(shape);
    }

    private static void printArea(Shape shape) {
        System.out.println("Area : " + shape.compute_area());
    }
}
