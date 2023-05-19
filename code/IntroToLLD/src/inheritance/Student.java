package inheritance;

public class Student extends User {

    Student(String name) {
        super(name);
    }

    void solveProblem() {
        System.out.println( "is solving problem.");
    }
}

// user
// instructor, student