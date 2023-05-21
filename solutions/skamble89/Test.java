package solutions.skamble89;

public class Test {
    public static void main(String[] args) {
        System.out.println(
                "For which shape would you like to compute area? Enter T/t for triangle or enter R/r for Rectangle");

        String input = System.console().readLine();
        System.out.println("Enter height");
        Double h = Double.parseDouble(System.console().readLine());
        System.out.println("Enter width");
        Double w = Double.parseDouble(System.console().readLine());

        Shape s;
        if (input.equalsIgnoreCase("T")) {
            s = new Triangle(h, w);
        } else {
            s = new Rectangle(h, w);
        }
        printArea(s);
    }

    private static void printArea(Shape s) {
        System.out.println(s.compute_area());
    }
}
