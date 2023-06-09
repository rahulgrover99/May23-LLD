package finalclass;

class ChildClass extends ObjectsDemo{
    public ChildClass(int x, int y) {
        super(x, y);
    }
}




public class Client {

    Integer i;





    public static void main(String[] args) {
        ObjectsDemo objectsDemo = new ObjectsDemo(1, 2);
        ObjectsDemo objectsDemo1 = new ObjectsDemo(1, 2);

        System.out.println(objectsDemo);
        System.out.println(objectsDemo1);

        ChildClass childClass = new ChildClass(1, 2);

        if (objectsDemo.equals(childClass)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }



    }
}
