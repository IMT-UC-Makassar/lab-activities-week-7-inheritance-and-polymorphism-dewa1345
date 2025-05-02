package oop.lab;

public class BusinessAccount extends BankAccount implements LoanService, OnlineService{
    private String loanStatus;

    public BusinessAccount(String accountNumber, String customerName, double balance) {
        super(accountNumber, customerName, balance);
        this.loanStatus = "None";
    }

    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }

   @Override
   public void calculateInterest() {
       double interest = balance * 0.025;
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