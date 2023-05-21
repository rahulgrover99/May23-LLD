package solutions.skamble89;

public class Triangle1 extends Shape1 {

    public Triangle1(double height, double width) {
        super(height, width);
    }

    public double compute_area() {
        return 0.5 * this.height * this.width;
    }
}
