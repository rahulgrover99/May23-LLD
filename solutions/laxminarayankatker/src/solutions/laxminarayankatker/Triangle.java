package solutions.laxminarayankatker;

public class Triangle  extends Shape {

    public Triangle() {
        super();
    }
    public Triangle(double height,double width) {
        super(height, width);
    }
    public double compute_area()
    {
        return 0.5*(this.height*this.width);
    }

}
