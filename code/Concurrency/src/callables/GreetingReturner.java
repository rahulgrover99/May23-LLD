package callables;


import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingReturner implements Callable<String> {
    @Override
    public String call() {
        Random random  = new Random();

        if (random.nextBoolean()) {
            return "Hello from " + Thread.currentThread().getName();
        } else {
            return "Bye from " + Thread.currentThread().getName();
        }
    }

}
