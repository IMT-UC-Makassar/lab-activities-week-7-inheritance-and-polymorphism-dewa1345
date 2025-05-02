package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService{
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }
    
}
