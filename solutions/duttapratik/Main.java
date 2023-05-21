package solutions.duttapratik;

import java.util.Scanner;

public class Main {

    static void printArea(Shape s){
        double area = s.compute_area();
        System.out.println("Area is "+ area);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shape name as either Triangle or Rectangle");
        String input = sc.next();
        System.out.println("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Enter width: ");
        double w = sc.nextDouble();
        Shape shape;
        if (input.equals("Triangle")) {
            shape = new Triangle(h, w);
        } else {
            shape = new Rectangle(h, w);
        }

        printArea(shape);
    }

}
