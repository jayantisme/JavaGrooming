package org.example.strategy;

public class CardStrategy implements PaymentStrategy{
    String cardNumber;
    String expiryDate;
    String cvv;
    String cardHolderName;

    public CardStrategy(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void amountToBePaid(double amount) {
        System.out.println(amount+ " paid using card.");
    }
}
