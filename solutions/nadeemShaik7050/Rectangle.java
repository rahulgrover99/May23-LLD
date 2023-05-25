package solutions.nadeemShaik7050;

public class Rectangle extends Shape {

    Rectangle(double height,double width){
        super(height, width);
    }
    
    @Override
    public double compute_area(){
        return (height*width);
    }
    
}
