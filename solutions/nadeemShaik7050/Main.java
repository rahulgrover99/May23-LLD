package solutions.nadeemShaik7050;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Shape");
        String input=sc.nextLine();
    
        System.out.println("Enter height of Shape");
        double h=sc.nextDouble();
    
        System.out.println("Enter width of Shape");
        double w=sc.nextDouble();
    
        Shape shape;
        if (input.equals("Triangle")) {
            shape = new Triangle(h, w);
        } else {
            shape = new Rectangle(h, w);
        }
    
        printArea(shape);
        
    }

    public static void printArea(Shape shape) {
        System.out.println("Area of the given Shape is "+ shape.compute_area());
    }
   
}
