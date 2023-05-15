package introtooops;

public class Main {
    public static void main(String[] args) {
        // Object 1
        Student chirag = new Student("Chirag", 1);

        // Object 2
        Student sachin = new Student("Sachin", 2);

        chirag.solvesProblem(1);
        sachin.solvesProblem(2);

        chirag.solvesProblem(3);
        sachin.solvesProblem(1);
    }
}
