package polymorphism;

public class Dog extends Mammals {
    Dog() {
        this.a = 15;
    }

    @Override
    void print() {
        System.out.println("DHAMAKAAA!");
        super.print();
        System.out.println("Printing from class Dog: " + a);
    }
}
