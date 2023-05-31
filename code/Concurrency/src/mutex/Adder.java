package mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Counter counter;
    Lock lock;

    Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            // Shared data
            lock.lock();
            counter.count += i;
            lock.unlock();
        }
    }
}
