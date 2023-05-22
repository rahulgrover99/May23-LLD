package solutions.samalprasant123;

public class Triangle extends Shape {
    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double compute_area() {
        return getHeight() * getWidth() * 0.5;
    }
}
