package solutions.duttapratik;

public class Triangle extends Shape {
    Triangle(double height, double width){
        super(height, width);
    }
    double compute_area(){
        return 0.5*this.width*this.height;
    }
}
