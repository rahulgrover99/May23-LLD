using System;
using sample;

namespace c_sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = "Triangle";
            Shape shape;
            if (input == "Triangle") {
                shape = new Triangle(10, 15);
            } else {
                shape = new Rectangle(10, 15);
            }
            Console.WriteLine(shape.compute_area());
        }
    }
}
