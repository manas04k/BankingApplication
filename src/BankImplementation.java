package src;

public class BankImplementation implements BankInterface {
    protected int accountNo;
    protected String name;
    protected double balance;
//    private double interestRate;
//    private String password = "Google@1999";
//
//    public int getAccountNo() {
//        return accountNo;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public double getInterestRate() {
//        return interestRate;
//    }
//
//    public void setInterestRate(double interestRate) {
//        this.interestRate = interestRate;
//    }
//    public void setPassword(String newPassword, String oldPassword) {
//        if (oldPassword == this.password) {
//            this.password = newPassword;
//            System.out.println("Your Password Changed Successfully");
//        } else {
//            System.out.println("Wrong Old Password");
//        }
//    }



    public BankImplementation(int accountNo, String name, int balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;

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
//        System.out.println("Interest : " + balance*interestRate/100);

        System.out.println("Interest Calculation will be implemented by Banks");
    }

}
