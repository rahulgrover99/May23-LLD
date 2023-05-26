package solutions.santoshjeergi;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape : Triangle/Rectangle");

        String input = sc.nextLine();

        System.out.println("Enter height");
        int hgt = sc.nextInt();

        System.out.println("Enter width");
        int width = sc.nextInt();

        Shape s;
        if (input.equals("Triangle")) {
            s = new Triangle(hgt, width);
        } else { //if (input.equals("Rectangle")){
            s = new Rectangle(width, hgt);
        }
        PrintArea(s);
    }



    private  static void  PrintArea( Shape s) {
        System.out.println(" s.Area : " + s.compute_area());
    }

}
