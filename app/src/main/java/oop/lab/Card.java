package oop.lab;

public abstract class Card {
    protected String cardNumber;
    protected String customerName;

    public Card(String cardNumber, String customerName) {
        this.cardNumber = cardNumber;
        this.customerName = customerName;
    }

    public abstract double getInterestRate();
    
}
