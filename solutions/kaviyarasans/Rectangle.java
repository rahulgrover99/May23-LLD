package solutions.kaviyarasans;

public class Rectangle extends Shape{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double compute_area() {
        return height * width;
    }
}
