package accessmodifier;

public class Client {
    public static void main(String[] args) {
        System.out.println(Box.time_pass);
        Box.time_pass += 10;
        System.out.println(Box.time_pass);
        Box.printMe();
        Box b1 = new Box();
        System.out.println(b1.getWidth());
        System.out.println(b1.time_pass);
    }
}
