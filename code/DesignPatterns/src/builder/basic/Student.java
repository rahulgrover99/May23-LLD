package builder.basic;

public class Student {

    private String name;
    private int age;
    private double psp;
    private String batchName;
    private int gradYear;
    private int yoe;

    Student(StudentData studentData) {
        this.name = studentData.getName();
        this.age = studentData.getAge();
        this.psp = studentData.getPsp();
        this.batchName = studentData.getBatchName();
        this.gradYear = studentData.getGradYear();
        this.yoe = studentData.getYoe();
        validate();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", gradYear=" + gradYear +
                ", yoe=" + yoe +
                '}';
    }

    private void validate() {
        if (this.gradYear > 2022) {
            throw new IllegalArgumentException("Grad year is invalid");
        }
        if (this.age > 90 || this.age < 10) {
            throw new IllegalArgumentException("Not valid age.");
        }
    }
}
