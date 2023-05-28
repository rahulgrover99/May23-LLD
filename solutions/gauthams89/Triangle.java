package solutions.gauthams89;

public class Triangle extends Shape {
	
	public Triangle(double height, double width) {
		super(height, width);
	}

	@Override
	public double compute_area() {
		return height * width / 2;
	}
}
