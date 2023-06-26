package builder.basic;

public class Client {

    public static void main(String[] args) {
        StudentData studentData = new StudentData();
        studentData.setAge(22);
        studentData.setName("ABC");
        studentData.setPsp(90.0);
        studentData.setBatchName("Super");
        studentData.setGradYear(2015);

        Student student = new Student(studentData);
        System.out.println(student);



        // 1. StudentData tightly related to Student class.
        // 2.


    }
}
