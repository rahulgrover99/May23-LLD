package solutions.samalprasant123;

import java.util.Scanner;

public class TestShapes {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter shape(Triangle or Rectangle): ");
            String input = scanner.nextLine();

            System.out.println("Enter height: ");
            double height = scanner.nextDouble();

            System.out.println("Enter width: ");
            double width = scanner.nextDouble();

            Shape shape;
            if (input.equals("Triangle")) {
                shape = new Triangle(height, width);
            } else {
                shape = new Rectangle(height, width);
            }

            printArea(shape);        }
    }

    private static void printArea(Shape shape) {
        System.out.println("Area: " + shape.compute_area());
    }

}
