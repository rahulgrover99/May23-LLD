package finalclass;

// 1. final keyword. -- class, method, variable
// 2. Objects class
// 3. Strings
// 4. Quick walkthrough -- sub-module.


// Contest - 60 mins contest  + 15 questions
// No coding
// All MCQs
// Judge the output of the program



// final with Class means that the class can not be inherited.
class Animal {

    // Variable 'legs' might not have been initialized
    final int legs;

    final int x = 0;

    Animal() {
        // for calling the constructor of the same class
        this(4);
    }
    Animal(int legs) {
        this.legs = legs;
        System.out.println("Animals");
    }

    final void getLegs() {
        System.out.println("The animal has 4 legs");
    }
}

// Util classes.
// Cannot be instantiated.
class UtilClass {

    static void x() {
        System.out.println("x method");
    }

//    static class InnerClass {
//
//    }

    private UtilClass() {}
}
// Classes with private constructors cannot be initialized
//class ChildUtil extends UtilClass {
//
//    ChildUtil() {
//        super();
//
//    }
//}

class Giraffe extends Animal {
    Giraffe(int legs) {
        super(legs);
    }

    // 'getLegs()' cannot override 'getLegs()' in 'finalclass.Animal';
    // overridden method is final
//    void getLegs() {
//
//    }
}


class A{
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A{

    B(){

        // Only mandatory to write super, if you have ONLY parametrized constructor
        // for the parent class
        System.out.println("Constructor B");
    }
}

class AT {
    int x;
    int y;
    int z;

    AT(){
        this(0, 0, 0);
    }

    AT(int x) {
        this(x, 0, 0);
    }

    AT(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Demo {


    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe(4);
        giraffe.getLegs();
        System.out.println(giraffe);

        final int a;
        a = 5;
        System.out.println(a);
        // final variables once initialized cannot change the value
//        a = 7;

        B b = new B();
    }
}
