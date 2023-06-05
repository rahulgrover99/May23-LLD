package semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {

    Queue<Object> store;
    String name;
    Semaphore ps;
    Semaphore cs;


    Consumer(String name, Queue<Object> store, Semaphore ps, Semaphore cs) {
        this.name = name;
        this.store = store;
        this.cs = cs;
        this.ps = ps;
    }

    @Override
    public void run() {
        try {
            cs.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("[%d] Consumer %s consumed a shirt in Thread %s\n",
                    store.size(), name, Thread.currentThread().getName());
            store.remove();
            ps.release();
    }
}
