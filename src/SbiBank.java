package src;

public class SbiBank extends BankImplementation {


    private double interestRate;

    public SbiBank(int accountNo, String name, int balance, double interestRate) {
        super(accountNo, name, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {

        System.out.println("Interest : " + balance*interestRate/100);

    }


}
