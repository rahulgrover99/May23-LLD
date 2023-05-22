package solutions.arvindsin02;

class Shape {
    double height;
    double width;

    Shape() {
        height = 0.0d;
        width = 0.0d;
    }
    Shape(double height, double width) {
        this.height = height;
        this. width = width;
    }

    double compute_area() {
        return height*width;
    }


}