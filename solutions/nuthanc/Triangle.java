package solutions.nuthanc;

public class Triangle extends Shape {

  Triangle(double height, double width) {
    super(height, width);
  }

  double compute_area() {
    double area = height * width * 0.5;
    return area;
  }
}
