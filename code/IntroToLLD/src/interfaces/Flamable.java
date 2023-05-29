package interfaces;

public interface Flamable {
    int rocketSpeed = 2;
    default void fly() {
        System.out.println(rocketSpeed);
    }
}
