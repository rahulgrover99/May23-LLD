package solutions.arvindsin02;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Shape name: Rectangle/Triangle");
        Scanner input = new Scanner(System.in);
        String shapeName = input.nextLine();

        System.out.println("Enter the height");
        double height = input.nextDouble();

        System.out.println("Enter the width");
        double width = input.nextDouble();
        double area;
        if(shapeName.equals("Rectangle")) {
            Rectangle r = new Rectangle(height, width);
            area = r.compute_area();
        } else {
            Triangle t = new Triangle(height, width);
            area = t.compute_area();
        }

        System.out.println("Area of the shape"+shapeName+" is: "+area);

    }
}