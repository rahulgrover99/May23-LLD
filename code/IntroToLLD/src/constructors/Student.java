package constructors;

public class Student {
    String name;
    private int id;
    private int totalProblemsSolved;

    Performance performance;

    // Parametrized constructor
    Student(String name, int id, int totalProblemsSolved, Performance performance) {
        this.name = name;
        this.id = id;
        this.totalProblemsSolved = totalProblemsSolved;
        this.performance = performance;
    }

    // Copy Constructor
    Student(Student otherStudent) {
        // Shallow copy!
        this.name = otherStudent.name;
        this.id = otherStudent.id;
        this.totalProblemsSolved = otherStudent.totalProblemsSolved;
        // for deep copy
        // for shallow copy -> this.performance = otherStudent.performance
        // this.performance = otherStudent.performance
        this.performance = new Performance(otherStudent.performance);
    }

}