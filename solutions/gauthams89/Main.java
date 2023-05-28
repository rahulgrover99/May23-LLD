package solutions.gauthams89;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		var out = System.out;
		out.print("Do you want to enter dimention of Rectangle or Triangle? :");
	    String shapeInp = in.readLine();
	    boolean isTriangle = shapeInp.toLowerCase().equalsIgnoreCase("triangle");
	    
	    if(isTriangle) {
	    	out.print("Enter Base: ");
	    }
	    else {
	    	out.print("Enter Width: ");
	    }
	    
	    double width = Double.parseDouble(in.readLine());
	    
	    if(isTriangle) {
	    	out.print("Enter Perpendicular height: ");
	    }
	    else {
	    	out.print("Enter Height: ");
	    }
	    
	    double height= Double.parseDouble(in.readLine());
	    
	    Shape shape = isTriangle?
	    		new Triangle(height, width):
    			new Rectangle(height, width);
	    
	    double area = shape.compute_area();
	    out.println(String.format("Area of %s is %.2f", shapeInp, area));
	}
}
