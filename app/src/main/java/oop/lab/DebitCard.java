package oop.lab;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String customerName) {
        super(cardNumber, customerName);
    }

    @Override
    public double getInterestRate() {
        return 0.0;
    }

}
