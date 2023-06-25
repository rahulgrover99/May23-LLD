package singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BetterLogger {

    private static BetterLogger logger = null;

    private final String logFile = "demo_better_log.txt";
    private PrintWriter writer;

    private BetterLogger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {}
    }

    public static synchronized BetterLogger getInstance(){
        if(logger == null)
            logger = new BetterLogger();
        return logger;
    }

    public void logWithdraw (String account, double amount) {
        writer.println("WITHDRAW (" + account + "): " + amount + "$");
    }

    public void logDeposit (String account, double amount) {
        writer.println("DEPOSIT (" + account + "): " + amount + "$");
    }

    public void logTransfer (String fromAccount, String toAccount, double amount) {
        writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): " + amount + "$");
    }

}