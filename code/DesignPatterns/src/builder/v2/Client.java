package builder.v2;

public class Client {

    public static void main(String[] args) {

//        A a = new A();
//        A.B b = (new A()).new B();

        // Step 1: To get Builder (or StudentData) inside the Student class,
        // because it is tightly bound.
        // Step 2: Clients obviously will only deal with Student -
        // Duty of student class to expose the builder
        // Step 3: We don't want anyone from outside to call the constructor
        // of Student.
        // Noone else can call the constructor of Student, only the builder can
        // call it.

        Student.Builder studentBuilder = Student.getBuilder();
        studentBuilder.setAge(22);
        studentBuilder.setName("ABC");
        studentBuilder.setPsp(90.0);
        studentBuilder.setBatchName("Super");
        studentBuilder.setGradYear(2015);
        Student student = studentBuilder.build();

//        Student.Builder builder = new Student.Builder();


        // Simply return Builder object instead of void from setters.
        Student student1 =
                Student.getBuilder()
                        .setAge(22)
                        .setName("ABC")
                        .setPsp(90.0)
                        .setBatchName("Super")
                        .setGradYear(2015)
                        .build();



    }
}
