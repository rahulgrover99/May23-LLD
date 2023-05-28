package solutions.poojathalur;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the shape - Rectangle or Triangle");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("Enter the height of "+input);
        double h = sc.nextDouble();

        System.out.println("Enter the width of "+input);
        double w = sc.nextDouble();

        Shape shape;
        if (input.equalsIgnoreCase("Triangle")) {
            shape = new Triangle(h, w);
        }
        else {
            shape = new Rectangle(h, w);
        }

        printArea(shape);
    }

    static void printArea(Shape shape){
        System.out.println(shape.compute_area());
    }
    
}
