package solutions.nuthanc;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter Shape: Triangle or Rectangle");
      String input = sc.nextLine();

      System.out.println("Enter Height");
      double h = sc.nextDouble();

      System.out.println("Enter Width");
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

  static void printArea(Shape shape) {
    System.out.println("Area is " + shape.compute_area());
  }
}
