
package solutions.laxminarayankatker;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = null;
        Shape shape = null;
        try {
            System.out.println(
                    "For which shape would you like to compute area? Enter \"Triangle\" for triangle or enter \"Rectangle\" for Rectangle");
            String shapename = reader.readLine();
            String tr = "Triangle";
            String rt = "Rectangle";
            System.out.println(
                    "Enter height");
            double height = Double.parseDouble(reader.readLine());
            System.out.println(
                    "Enter Width");
            double width = Double.parseDouble(reader.readLine());

            if (shapename.equalsIgnoreCase(rt)) {
                shape = new Rectangle(height, width);
            } else {
                shape = new Triangle(height, width);
            }

            printArea(shape);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void printArea(Shape shape)
    {
        double area  = shape.compute_area();
        System.out.println(
                "Area is ..."+ area);

    }
}