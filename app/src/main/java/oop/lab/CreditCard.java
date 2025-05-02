package oop.lab;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String customerName) {
        super(cardNumber, customerName);
    }

    @Override
    public double getInterestRate() {
        return 15.00;
    }
    
}
