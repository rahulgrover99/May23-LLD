package solutions.Biswajit8;

public class Triangle extends Shape {


    Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double compute_area() {
        return 0.5 * this.height * this.width;
    }
}
