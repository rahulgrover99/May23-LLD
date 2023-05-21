package solutions.okSanky;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of test cases:-");
		int t = sc.nextInt();
		while(t > 0) {
			System.out.println("Enter the shape name like 'Triangle' or 'Rectangle':-");
			String input = sc.next();
			System.out.println("Enter height:");
			double h = sc.nextDouble();
			System.out.println("Enter width:");
			double w = sc.nextDouble();

			Shape shape;
			if (input == "Triangle") {
			    shape = new Triangle(h, w);
			} else {
			    shape = new Rectangle(h, w);
			}
			printArea(shape);
			t -=1;
		}
		return;
	}
	
	public static void printArea(Shape s) {
		System.out.println("Area is:- "+ s.compute_area());
	}

}
