package solutions.okSanky;

public class Rectangle extends Shape {

	public Rectangle(double height, double width) {
		super(height, width);
	}
	
	protected double compute_area() {
		return this.height*this.width;
	}
}
