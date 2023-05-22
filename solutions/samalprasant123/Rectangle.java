package solutions.samalprasant123;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double compute_area() {
        return getHeight() * getWidth();
    }
}
