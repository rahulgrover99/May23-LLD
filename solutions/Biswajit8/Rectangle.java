package solutions.Biswajit8;

public class Rectangle extends Shape {

    Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double compute_area() {
        return this.height * this.width;
    }
}
