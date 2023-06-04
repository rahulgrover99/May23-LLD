package ritik2117;

public class Triangle extends Shape {

    Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    double compute_area() {
        return ((height * width)/2);
    }
}
