package adapter;

public class Client {

    public static void main(String[] args) {

        YesBankAdapter yesBankAdapter = new YesBankAdapter();
        ICICIBankAdapter iciciBankAdapter = new ICICIBankAdapter();

        PhonePe phonePe = new PhonePe(yesBankAdapter);

        phonePe.getBalance();

        

    }

}
