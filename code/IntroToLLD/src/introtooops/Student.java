package introtooops;

public class Student {
    private String name;
    private int id;
    private int totalProblemsSolved;

    Student() {
        id = 1;
        totalProblemsSolved = 2;
        name = "Rahul";

        System.out.println("The constructor was called.");
    }

    public void solvesProblem(int count) {
        this.totalProblemsSolved += count;
        System.out.println(this.name + " solved " + this.totalProblemsSolved + " problems.");
    }

    // Constructor
//    public Student(String name, int id) {
//        this.name = name;
//        this.id = id;
//        this.totalProblemsSolved = 0;
//    }

}
