package solutions.santoshjeergi;

public class Shape {
    private double height;
    private double width;

    public Shape( double height, double width) {
        this.width = width;
        this.height = height;
    }
    public double  compute_area()
    {
        return 0; //height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}