package solutions.nage1234;

public class Triangle extends Shape{
	public Triangle(double h, double w) {
		super(h, w);
	}
	
	@Override
	public double compute_area() {
		return this.height * this.width * 0.5;
	}
}
