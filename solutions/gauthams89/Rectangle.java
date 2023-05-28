package solutions.gauthams89;

public class Rectangle extends Shape {

	public Rectangle(double height, double width) {
		super(height, width);
	}

	@Override
	public double compute_area() {
		return width * height;
	}
}
