package reflection;

import annotations.MyAnnotations.ImportantMethod;


public class Dummy {
    private int age;
    private String name;

    public Dummy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name + " " + age);
    }

//    @ImportantMethod
    private void privatePrint() {
        System.out.println(name + " private " + age);
    }

    public static void iAmPublicStatic() {
        System.out.println("I am public static.");
    }

    private static void iAmPrivateStatic() {
        System.out.println("I am private static.");
    }
}
