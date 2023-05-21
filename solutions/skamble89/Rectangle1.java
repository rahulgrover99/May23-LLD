package solutions.skamble89;

public class Rectangle1 extends Shape1 {
    public Rectangle1(double height, double width) {
        super(height, width);
    }

    public double compute_area() {
        return this.height * this.width;
    }
}
