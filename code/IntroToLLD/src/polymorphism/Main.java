package polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a2 = new Mammals();
        Animal a3 = new Dog();

        a.print();
        a2.print();
        // Cannot resolve method 'printMammal' in 'Animal'

        // Ask compiler to shut up and force convert the type Animal
        // to Mammals and then call the method.
//        ((Mammals) a2).printMammal();
        a3.print();
    }
}
