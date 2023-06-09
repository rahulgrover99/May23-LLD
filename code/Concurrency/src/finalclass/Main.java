package finalclass;

class Counter{
    private int count;

    // Object level lock taken
    synchronized void increment() {}
    synchronized void decrement() {}

    int getCount() {
        return count;
    }
}

public class Main {



    // Thread1
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // Can this be possible concurrently?
        // Thread 1
        counter1.decrement();
        // Thread 2
        counter1.increment();

        // NOT POSSIBLE --> Same object --> object level locks


        // Can this be possible concurrently?
        // Thread 1
        counter1.decrement();
        // Thread 2
        counter2.increment();

        // Yes since different objects

        // Thread 1
        counter1.decrement();
        // Thread 2
        counter1.getCount();

        // Yes, since the second method is not synchronized.

    }

}
