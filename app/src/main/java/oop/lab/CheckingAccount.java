package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService{
    public CheckingAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }

    @Override
    public void transferFunds(double amount, String targetAccount) {
        withdraw(amount);
    }

    @Override
    public void calculateInterest() {  
    }
    
}
