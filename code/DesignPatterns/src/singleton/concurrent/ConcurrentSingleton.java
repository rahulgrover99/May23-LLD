package singleton.concurrent;


public class ConcurrentSingleton {

    private static ConcurrentSingleton INSTANCE = null;

    public static ConcurrentSingleton getInstance() {

        // If we have a lock here,
        // any thread entering this method, would have to get a lock
        if (INSTANCE == null) {
            synchronized (ConcurrentSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ConcurrentSingleton();
                }
            }
        }
        return INSTANCE;
    }

    private ConcurrentSingleton() {}

}
