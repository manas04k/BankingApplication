package src;

public class Main {
    public static void main(String[] args) {
        ManasBank account = new ManasBank(112233441, "Manas",50000, 4.5);

        account.checkBalance();
        account.addMoney(20000);
        account.checkBalance();
        account.withdrawlMoney(10000);
        account.calculateInterest();

//        BankImplementation bnk = new ManasBank(112233441, "Manas",50000, 4.5);

    }



}
