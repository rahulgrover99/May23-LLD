package solutions.okSanky;

public class Triangle extends Shape {

	public Triangle(double height, double width) {
		super(height, width);
	}
	
	protected double compute_area() {
		return (0.5*this.height*this.width);
	}
}
