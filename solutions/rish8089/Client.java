package solutions.rish8089;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Client {
    enum ShapeNames{
        Triangle,Rectangle;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ShapeNames sn;
        try {
            sn = ShapeNames.valueOf(input);
        }catch(IllegalArgumentException e){
            System.out.println("Not a valid shape");
            return;
        }
        String[] str = br.readLine().split(" ");
        double height = Double.parseDouble(str[0]);
        double width = Double.parseDouble(str[1]);
        Shape shape;
        if (ShapeNames.Triangle.equals(sn)) {
            shape = new Triangle(height, width);
        } else {
            shape = new Rectangle(height, width);
        }
        printArea(shape);
    }

    private static void printArea(Shape s) {
        System.out.println(s.compute_area());
    }
}
