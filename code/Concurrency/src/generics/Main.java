package generics;

public class Main {
    public static void main(String[] args) {
        Printer<Long> ip = new Printer<>(2L);

        ip.print();
    }

}
