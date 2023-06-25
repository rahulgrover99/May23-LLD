package singleton.basic;

public class Singleton {

    private int count = 0;

    // Has to be static (referencing from static scope)
    private static Singleton INSTANCE = null;

    // Has to be static, we won't be able to get objects otherwise.
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void makeConnection() {
        if (count > 3) System.out.println("False");
        else {
            System.out.println("True");
            count++;
        }
    }


    private Singleton() {}

}
