package ritik2117;

import java.util.Scanner;

public class Main {

    private static void printArea(Shape shape) {
        System.out.println("Area is : " + shape.compute_area());
    }
    public static void main(String[] args) {
        Shape shape;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape: ");
        String input = sc.nextLine();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        sc.close();
        if (input.equals("Triangle")) {
            shape = new Triangle(height, width);
        }
        else {
            shape = new Rectangle(height, width);
        }
        shape.compute_area();
        printArea(shape);
    }
}
