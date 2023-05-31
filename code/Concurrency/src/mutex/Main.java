package mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(counter, lock);
        Subtractor subtractor = new Subtractor(counter, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
//        Object
        // Creating the threads.
        t1.start();
        t2.start();

        // Wait for both the threads to complete.
        t1.join();
        t2.join();

        System.out.println("The count value is: " + counter.count);

    }

}
