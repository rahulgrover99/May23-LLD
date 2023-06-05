package semaphores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();

        Semaphore ps = new Semaphore(1000);
        Semaphore cs = new Semaphore(0);

        for (int i = 0; i < 1000; i++) {
            Producer p = new Producer("P" + i, queue, 5, ps, cs);
            Consumer c = new Consumer("C" + i, queue, ps, cs);

            Thread tp = new Thread(p);
            Thread tc = new Thread(c);

            tc.start();
            tp.start();

        }

    }
}
