package inheritance;

public class Instructor extends User {

    String company = "X";
    Instructor(String name) {
        // Keyword that calls the constructor of the base class
//        super(name);
        this.name = name;
        // There is no default constructor available in 'inheritance.User'
        System.out.println("Constructor of Instructor.");
    }

    Instructor() {
        System.out.println("Constructor of Instructor.");
    }

    void teach() {
        System.out.println(" is teaching");
    }

}
