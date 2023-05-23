package  solutions.arvindsin02;

class Rectangle extends Shape {

    Rectangle(double height, double width) {
        super(height, width);
    }
    @Override
    double compute_area() {
        return this.height*this.width;
    }
}