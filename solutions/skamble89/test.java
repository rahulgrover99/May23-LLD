package solutions.skamble89;

public class test {
    public static void main(String[] args) {
        System.out.println(
                "For which shape would you like to compute area? Enter T/t for triangle or enter R/r for Rectangle");

        String input = System.console().readLine();
        System.out.println("Enter height");
        Double h = Double.parseDouble(System.console().readLine());
        System.out.println("Enter width");
        Double w = Double.parseDouble(System.console().readLine());

        shape s;
        if (input.equals("T")) {
            s = new triangle(h, w);
        } else {
            s = new rectangle(h, w);
        }
        printArea(s);
    }

    private static void printArea(shape s) {
        System.out.println(s.compute_area());
    }
}
