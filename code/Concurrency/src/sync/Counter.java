package sync;

public class Counter {
    private static int count = 0;

     public int getCount() {
             return count;
    }

    synchronized public void decrement(int i) {
         synchronized (Counter.class) {
             count -= i;
         }

    }

    synchronized static public void increment(int i) {
        count += i;
    }

}
