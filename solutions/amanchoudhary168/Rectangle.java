package solutions.amanchoudhary168;

/**
 * @author : aman.choudhary
 * @version : 1.0.0
 * date : 26-05-2023
 **/
public class Rectangle extends Shape{

    public Rectangle(double height,double width){
        super(height,width);
    }

    @Override
    public double computeArea(){
        return height*width;
    }
}
