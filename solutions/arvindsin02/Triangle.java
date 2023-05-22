package solutions.arvindsin02;

class Triangle extends  Shape {
    Triangle(double height, double width) {
        super(height, width);
    }
    @Override
    double compute_area() {
        return (0.5*this.height*this.width);
    }
}