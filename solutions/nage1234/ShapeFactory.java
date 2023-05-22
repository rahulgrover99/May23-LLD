package solutions.nage1234;

public class ShapeFactory {
	public static final String RECTANGLE = "Rectangle";
	public static final String TRIANGLE = "Triangle";
	public void callShape(String shapeName, double h, double w) {
		Shape s = null;
		if(shapeName.equals(RECTANGLE)) {
			s = new Rectangle(h, w);
		} else if(shapeName.equals(TRIANGLE)) {
			s = new Triangle(h, w);
		} else {
			s = new Shape();
		}
		System.out.println("Area Computed for "+shapeName+" is "+s.compute_area());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		sf.callShape(RECTANGLE, 12, 15);
		sf.callShape(TRIANGLE, 10, 5);
	}

}
