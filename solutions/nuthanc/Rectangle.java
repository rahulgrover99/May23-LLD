package solutions.nuthanc;

public class Rectangle extends Shape {

  Rectangle(double height, double width) {
    super(height, width);
  }

  double compute_area() {
    double area = height * width;
    return area;
  }
}
