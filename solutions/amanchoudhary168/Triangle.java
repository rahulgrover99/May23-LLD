package solutions.amanchoudhary168;

/**
 * @author : aman.choudhary
 * @version : 1.0.0
 * date : 26-05-2023
 **/
public class Triangle  extends Shape{

    public Triangle(double height,double width){
        super(height,width);
    }

    @Override
    public double computeArea(){
        return 0.5d*height*width;
    }
}
