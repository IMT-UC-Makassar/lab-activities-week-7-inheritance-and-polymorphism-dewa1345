package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String customerName;
    protected double balance;
    
    public BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void calculateInterest();
    
}
