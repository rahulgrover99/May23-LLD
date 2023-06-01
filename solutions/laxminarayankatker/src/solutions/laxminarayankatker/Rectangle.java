package solutions.laxminarayankatker;

public class Rectangle extends Shape{

    public Rectangle()
    {
        super();
    }
    public Rectangle(double height,double width)
    {
        super(height, width);
        // this.height = height;
        // this.width = width;
    }
    public double compute_area()
    {
        return this.height*this.width;
    }
}

