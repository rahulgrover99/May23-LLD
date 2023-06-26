package builder.v2;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private int gradYear;
    private int yoe;

    static class Builder {

        private String name;
        private int age;
        private double psp;
        private String batchName;
        private int gradYear;
        private int yoe;

        public Student build() {
            return new Student(this);
        }

        public int getYoe() {
            return yoe;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
    }

    // This has to be static. And hence the class al
    public static Builder getBuilder() {
        return new Builder();
    }

//    public Student setName(String name) {
//        return new Student(this).name = name;
//    }

    private Student(Builder studentData) {
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
