package inheritance;

import java.util.List;

public class Main {

    private static void printName(List<User> users) {
        for (User u: users) {
            System.out.println(u.name);
        }
    }

    public static void main(String[] args) {
        User instructor = new Instructor("Anshuman");
        // name, age, email, login, teach
        instructor.login();
        System.out.println(((Instructor) instructor).company);
//        instructor.teach();


//        Instructor notInstructor = new User();

        if (instructor instanceof User) {
            System.out.println("Instructor is instance of User");
        }

        printName(List.of(new Student("Sahil"), new Instructor("Rahul"), instructor));
    }
}
