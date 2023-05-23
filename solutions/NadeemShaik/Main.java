package solutions.nikhillund;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.next();
            int h = sc.nextInt();
            int w = sc.nextInt();

            Shape shape;
            if (input.equalsIgnoreCase("Triangle")) {
                shape = new Triangle(h, w);
            } else {
                shape = new Rectangle(h, w);
            }
            printArea(shape);
        }
    }

    private static void printArea(Shape shape) {
        System.out.println(shape.compute_area());
    }
}
