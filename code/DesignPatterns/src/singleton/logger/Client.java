package singleton.logger;

public class Client {

    public static void main(String[] args) {
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.logDeposit("0001", 80.5);
        logger2.logWithdraw("0002", 100);
        logger1.logTransfer("0001", "0003", 40);
        logger3.logDeposit("0004", 56.74);
        logger2.logWithdraw("0005", 30);

        BetterLogger bLogger1 = BetterLogger.getInstance();
        BetterLogger bLogger2 = BetterLogger.getInstance();
        BetterLogger bLogger3 = BetterLogger.getInstance();

        bLogger1.logDeposit("0001", 80.5);
        bLogger2.logWithdraw("0002", 100);
        bLogger1.logTransfer("0001", "0003", 40);
        bLogger3.logDeposit("0004", 56.74);
        bLogger2.logWithdraw("0005", 30);
    }
}
