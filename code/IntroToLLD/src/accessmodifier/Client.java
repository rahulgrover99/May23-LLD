package accessmodifier;

public class Client {
    public static void main(String[] args) {
        Box.printMe();
        Box b1 = new Box();
        System.out.println(b1.getWidth());
    }
}
