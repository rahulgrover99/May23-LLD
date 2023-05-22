package solutions.nage1234;

public class Rectangle extends Shape{
	public Rectangle(double h, double w) {
		super(h, w);
	}
	
	@Override
	public double compute_area() {
		return this.height * this.width;
	}

}
