package callables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 10; i++) {
            GreetingReturner gr = new GreetingReturner();
            Future<String> greetingFuture = executorService.submit(gr);
//            System.out.println(greetingFuture.get());
        }



    }

}
