package src;

public class ManasBank implements Bank{
    int accountNo;
    String name;
    double balance;
    double interestRate;

    public ManasBank(int accountNo, String name, int balance, double interestRate) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }


    @Override
    public void addMoney(double money) {
        balance = balance + money;
        System.out.println("Amount Credit : " + money);
        System.out.println("Your Total Balance : " + balance);
    }

    @Override
    public boolean withdrawlMoney(double money) {
        if(money<=balance){
            balance = balance-money;
            System.out.println("Amount Deducted : " + money);
            System.out.println("Your Remaining Balance : " + balance);
            return true;
        }
        else{
            System.out.println("Your Account Balance is Low");
            return false;
        }

    }

    @Override
    public void checkBalance() {
        System.out.println("Your Total Balance : " + balance);

    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest : " + balance*interestRate/100);

    }
}
