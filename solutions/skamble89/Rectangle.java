package solutions.skamble89;

public class Rectangle extends Shape {
    public Rectangle(double height, double width) {
        super(height, width);
    }

    public double compute_area() {
        return this.height * this.width;
    }
}
