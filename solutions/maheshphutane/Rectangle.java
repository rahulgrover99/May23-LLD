package solutions.maheshphutane;


public class Rectangle extends Shape {
    double height,width;
    public Rectangle(double height,double width){
        super();
        this.height = height;
        this.width = width;
    }

    public double compute_area(double height,double width){
        return height*width;
    }
}
