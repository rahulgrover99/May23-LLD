package constructors;

public class Performance {
    public int marks = 50;
    public double psp = 81.7;

    public Performance() {
        this.marks = 50;
        this.psp = 81.7;
    }

    public Performance(Performance performance) {
        this.marks = performance.marks;
        this.psp = performance.psp;
    }
}


