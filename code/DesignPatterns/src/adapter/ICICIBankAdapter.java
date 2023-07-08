package adapter;

import adapter.thirdparty.icici.ICICIBankApi;

public class ICICIBankAdapter implements BankApiAdapter{

    private ICICIBankApi iciciBankApi = new ICICIBankApi();
    @Override
    public double getBalance(String accountNumber) {
        iciciBankApi.printSomething();
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        iciciBankApi.printSomething();
        return false;
    }
}
