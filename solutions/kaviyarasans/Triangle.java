package solutions.kaviyarasans;

public class Triangle extends Shape{
    public Triangle(double height, double base) {
        super(height, base);
    }

    @Override
    public double compute_area() {
        return 0.5 * height * width;
    }
}
