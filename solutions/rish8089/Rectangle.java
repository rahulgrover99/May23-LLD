package solutions.rish8089;

public class Rectangle extends Shape {
    Rectangle(double height, double width){
        super(height,width);
    }
    public double compute_area(){
        return height*width;
    }
}
