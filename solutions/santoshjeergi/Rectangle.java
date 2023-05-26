package solutions.santoshjeergi;

public class Rectangle extends  Shape{

    public Rectangle(double width, double height) {
        super(height, width);
    }

    @Override
    public double compute_area() {
        //return super.compute_area();
        return getHeight() * getWidth() * 0.1;
    }
}
