package sync;

public class Adder implements Runnable{

    Counter counter;

    Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Shared data
//            synchronized (counter) {
                // The key will only be required for sync methods
                Counter.increment(i);
//            }

        }
    }
}
