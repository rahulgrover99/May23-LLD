package adapter;

public class PhonePe {

    private BankApiAdapter bankApiAdapter;

    PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    void getBalance() {
        bankApiAdapter.getBalance("12221");
    }

}
