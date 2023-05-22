package abstractclasses;

public abstract class User {
    public String name;

    public void login() {
        System.out.println("Log in " + name);
    }
}

