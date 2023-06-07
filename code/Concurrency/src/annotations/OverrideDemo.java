package annotations;

class ParentClass {
    public void getName() {
        System.out.println("Rahul");
    }
}

class ChildClass extends ParentClass {
//    @Override
    public void getname() {
        System.out.println("Hehe");
    }
}

public class Override {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.getName();
    }
}
