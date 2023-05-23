package solutions.nikhillund;

public class Rectangle extends Shape{
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double compute_area() {
        return height*width;
    }
}
