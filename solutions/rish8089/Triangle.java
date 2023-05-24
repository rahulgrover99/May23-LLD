package solutions.rish8089;

public class Triangle extends Shape {
    Triangle(double height, double width){
        super(height,width);
    }
    public double compute_area(){
        return 0.5*height*width;
    }
}
