package introtooops;

public class Student {
    private String name;
    private int id;
    private int totalProblemsSolved;

    public void solvesProblem(int count) {
        this.totalProblemsSolved += count;
        System.out.println(this.name + " solved " + this.totalProblemsSolved + " problems.");
    }

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.totalProblemsSolved = 0;
    }

}
