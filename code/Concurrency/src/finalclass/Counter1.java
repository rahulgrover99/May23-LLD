package finalclass;

public class Counter1 {
    Integer count=0;

    public void increment(int i) {
        // Lock on value 0
        // value changed to 1
        synchronized (count){
            count+=i;
        }

    }

    public void decrement(int i) {
        // Wanting a lock on value 0
        synchronized (count){
            count-=i;
        }
    }

    public int getCount() {
        return count;
    }
}
