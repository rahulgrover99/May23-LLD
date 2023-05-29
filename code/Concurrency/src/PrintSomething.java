public class PrintSomething implements Runnable{
    @Override
    public void run() {
        System.out.println("I am running on thread " + Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}


/*

Scheduler

-- List of tasks
-- addingTask


Task
-- tim


 */