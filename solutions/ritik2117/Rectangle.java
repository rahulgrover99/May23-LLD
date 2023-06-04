package ritik2117;

public class Rectangle extends Shape {

    Rectangle(double height, double width) {
        super(height, width);
    }
    
    @Override
    double compute_area() {
        return height * width;
    }
}
