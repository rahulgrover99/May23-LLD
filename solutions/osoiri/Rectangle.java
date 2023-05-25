package solutions.osoiri;

public class Rectangle extends Shape{

    Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double compute_area() {
        return this.width*this.height;
    }
}
