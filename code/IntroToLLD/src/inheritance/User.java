package inheritance;

public class User {
    protected String name = "default";
    String email = "default@google.com";
    int age = 10;

    User(String name) {
        this.name = name;
        System.out.println("Constructor of User class");
    }

    public User(){
        System.out.println("Constructor of User class");
    }

    void login() {
        System.out.println(name + "is logged in.");
    }


}
