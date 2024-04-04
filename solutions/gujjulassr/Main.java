import java.util.Scanner;

class Shape{
    double height=0.0;
    double width=0.0;

    Shape(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double compute_area(){
        return height*width;
    }


}


class Traingle extends Shape{
    Traingle(double height, double width){
        super(height, width);
    }

    public double compute_area(){
        return 0.5*height*width;
    }
}


class Rectangle extends Shape{
    Rectangle(double height, double width){
        super(height, width);
    }

    public double compute_area(){
        return height*width;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape shape;

        System.out.println("Enter the Shape like 'Triangle' or 'Rectangle' to calculate Area :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals("Traingle")) {
            System.out.println("inside the main");
            System.out.println("Enter the height :");
            double h = sc.nextDouble();
            System.out.println("Enter the width :");
            double w = sc.nextDouble();
            shape = new Traingle(h, w);

            System.out.println("Area : " + shape.compute_area());
            return;
        } else if (input.equals("Rectangle")){
            System.out.println("Enter the height :");
            double h = sc.nextDouble();
            System.out.println("Enter the width :");
            double w = sc.nextDouble();
            shape = new Rectangle(h, w);

            System.out.println("Area : " + shape.compute_area());
            return;
        } else {
            System.out.println("Invalid Shape has Been Entered");
            System.out.println("Area is :"+0.0);
            return;
        }
    }
}