package introtooops;

public class Student {
    private String name;
    private int id;
    private int totalProblemsSolved;

    final public int marks;
    Student() {
        id = 1;
        totalProblemsSolved = 2;
        name = "Rahul";
        marks = 5;
        System.out.println("The constructor was called.");
    }

    public void solvesProblem(int count) {
//        final String x;
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
