public class NumberPrinter implements Runnable {

    int i;

    NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i +
                " is being printed on Thread " + Thread.currentThread().getName());
    }
}
