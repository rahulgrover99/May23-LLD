using System;

namespace sample{

    class Triangle : Shape
    {
        public Triangle(double height, double width): base(height, width)
        {
            Console.WriteLine("Triangle constrcutor called");
        }

        
        public override double compute_area()
        {
            
            return (this.height * this.width) / 2;
        }
    }
}
