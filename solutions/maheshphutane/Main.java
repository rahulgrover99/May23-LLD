package solutions.maheshphutane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        String areaOf = sc.next();

        if(areaOf.equals("Triangle")){
            shape = new Triangle(h,w);
        }else{
            shape = new Rectangle(h,w);
        }
        printArea(shape);
    }

    private static void printArea(Shape shape) {
        System.out.println(shape.compute_area());
    }
}
