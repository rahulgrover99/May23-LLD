
namespace sample
{
    public class Shape
    {
        public double height;
        public double width;

        public Shape(double height, double width)
        {   
            this.height = height;
            this.width = width;
        }

        public virtual double compute_area()
        {
            return 0;
        }
    }
}

