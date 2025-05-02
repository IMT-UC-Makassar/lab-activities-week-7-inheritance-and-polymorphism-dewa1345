package oop.lab;

public interface LoanService extends OnlineService {
    void applyForLoan(double amount);
    String checkLoanStatus();
}