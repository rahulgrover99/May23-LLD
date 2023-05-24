package solutions.nadeemShaik7050;

public class Triangle extends Shape{

    Triangle(double height,double width){
        super(height, width);
    }
    
    @Override
    public double compute_area(){
        return (0.5*height*width);
    }
}
