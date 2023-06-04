package ritik2117;

public class Shape {
    double height, width;

    Shape () {
        System.out.println("Deafult Constructor");
        height = 0;
        width = 0;
    }

    Shape (double height, double width) {
        this.height = height;
        this.width = width;
    }

    double compute_area() {
        return 0d;
    }
}
