namespace sample{

    class Rectangle : Shape
    {
        public Rectangle(double height, double width) : base(height, width)
        {
        }

        
        public override double compute_area()
        {
            return (this.height * this.width);
        }
    }
}