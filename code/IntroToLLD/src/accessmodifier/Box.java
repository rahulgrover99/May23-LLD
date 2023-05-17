package accessmodifier;

public class Box {


    static int time_pass = 10;
    public static void printMe() {
        System.out.println("I am a box");

    }
    protected int width = 1;
    // No access modifier -> default -> Package private
    int height = 2;

    public int breadth = 3;

    int getWidth() {
        System.out.println(time_pass);
        return width;

    }
}
