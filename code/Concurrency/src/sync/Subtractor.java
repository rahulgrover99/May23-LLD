package sync;

public class Subtractor implements Runnable {

    Counter counter;

    Subtractor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Shared data
            synchronized (counter) {
                counter.decrement(i);
            }
        }
    }
}
