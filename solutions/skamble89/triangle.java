package solutions.skamble89;

public class triangle extends shape {

    public triangle(double height, double width) {
        super(height, width);
    }

    public double compute_area() {
        return 0.5 * this.height * this.width;
    }
}
