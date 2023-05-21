package solutions.maheshphutane;

public class Rectangle extends Shape {
    double height,width;
    public Rectangle(double height,double width){
        super(height,width);
        this.height = height;
        this.width = width;
    }

    public double compute_area(){
        return this.height*this.width;
    }
}
