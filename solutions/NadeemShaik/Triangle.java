package solutions.nikhillund;

public class Triangle extends Shape {
    public Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    double compute_area() {
        return (this.height * this.width)/2;
    }
}
