package annotations;

class ParentClass {
    public void getName() {
        System.out.println("Rahul");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void getName() {
        System.out.println("Hehe");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.getName();
    }
}
