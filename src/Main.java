package src;

public class Main {
    public static void main(String[] args) {
        ManasBank account = new ManasBank(112233441, "Manas",50000, 10.3 );

        account.checkBalance();
        account.addMoney(20000);
        account.checkBalance();
        account.withdrawlMoney(10000);
        account.calculateInterest();

        account.setPassword("Manas@1999", "Google@199");

    }



}
