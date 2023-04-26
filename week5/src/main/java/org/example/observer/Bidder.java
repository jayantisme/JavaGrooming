package org.example.observer;

public class Bidder implements Observer {

    String bidderName;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }

    @Override
    public void update(Observer observer, String productName, double bidAmount) {
        if (observer.toString().equals(bidderName)) {
            System.out.println("Hello " + bidderName + " New Bid of Amount " + bidAmount + " is Placed on " + productName + " by you");
        }
        else {
            System.out.println("Hello " + bidderName + " New Bid of Amount " + bidAmount + " is Placed on " + productName + " by "+observer);
        }
    }

    @Override
    public String toString() {
        return bidderName;
    }
}
