package solutions.amanchoudhary168;

import java.util.Scanner;

/**
 * @author : aman.choudhary
 * @version : 1.0.0
 * date : 26-05-2023
 **/
public class Main {
    public static void main(String[] args) {
        Shape shape;
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input){
            case "Triangle" :
                double heightT = scan.nextDouble();
                double widthT = scan.nextDouble();
                shape = new Triangle(heightT,widthT);
                printArea(shape);
                break;
            case "Rectangle" :
                double heightR = scan.nextDouble();
                double widthR = scan.nextDouble();
                shape = new Rectangle(heightR,widthR);
                printArea(shape);
                break;

            default:{
                System.out.println("Invalid Choice");
            }
        }

    }

    public static void printArea(Shape shape){
        System.out.println(shape.computeArea());
    }
}




