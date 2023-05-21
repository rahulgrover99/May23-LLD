package solutions.maheshphutane;

public class Triangle extends Shape {
    double height,width;
    public Triangle(double height,double width){
        super(height,width);
        this.height = height;
        this.width = width;
    }
    public double compute_area(double height,double width){
        return height*width;
    }
}
