package annotations;

class FooBar {
    @Deprecated()
    void foo() {
        System.out.println("foo");
    }

    void bar() {
        System.out.println("bar");
    }
}

public class DeprecatedDemo {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar();
        fooBar.bar();
    }
}
