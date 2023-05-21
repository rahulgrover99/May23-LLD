package solutions.skamble89;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(
                "For which shape would you like to compute area? Enter T/t for triangle or enter R/r for Rectangle");

        String input = System.console().readLine();
        System.out.println("Enter height");
        Double h = Double.parseDouble(System.console().readLine());
        System.out.println("Enter width");
        Double w = Double.parseDouble(System.console().readLine());

        Shape1 s;
        if (input.equalsIgnoreCase("T")) {
            s = new Triangle1(h, w);
        } else {
            s = new Rectangle1(h, w);
        }
        printArea(s);
    }

    private static void printArea(Shape1 s) {
        System.out.println(s.compute_area());
    }
}
