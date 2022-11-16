package src;

public class ManasBank extends BankImplementation {


    private double interestRate;

    public ManasBank(int accountNo, String name, int balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {

        System.out.println("Interest : " + balance*interestRate/100);

    }


}
