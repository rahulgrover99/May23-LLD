package solutions.santoshjeergi;


public class Triangle extends  Shape{
    public  Triangle(double height, double width)
    {
        super(height, width);
    }

    @Override
    public double compute_area() {
        //return super.compute_area();
        return getHeight() * getWidth();
    }
}