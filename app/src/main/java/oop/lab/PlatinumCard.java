package oop.lab;

public class PlatinumCard extends Card {
    public PlatinumCard(String cardNumber, String customerName) {
        super(cardNumber, customerName);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
    
}
