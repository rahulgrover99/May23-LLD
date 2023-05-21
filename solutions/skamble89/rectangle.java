package solutions.skamble89;

public class rectangle extends shape {
    public rectangle(double height, double width) {
        super(height, width);
    }

    public double compute_area() {
        return this.height * this.width;
    }
}
