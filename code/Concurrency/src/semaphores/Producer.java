package semaphores;


import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {

    String name;
    int cap;
    Queue<Object> store;
    Semaphore ps;
    Semaphore cs;


    Producer(String name, Queue<Object> store, int cap, Semaphore ps, Semaphore cs) {
        this.name = name;
        this.store = store;
        this.cap = cap;
        this.ps = ps;
        this.cs = cs;
    }

    @Override
    public void run() {
        try {
            ps.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("[%d] Producer %s produced a shirt in Thread %s\n",
                    store.size(), name, Thread.currentThread().getName());
        store.add(new Object());
        cs.release();
    }

}
