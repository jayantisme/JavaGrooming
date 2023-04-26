package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    // flag, synchronization
    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private double bidAmount;
    boolean flag = false;

    public Product(String productName, double bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        synchronized (this) {
            if (!observers.contains(observer)) observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        synchronized (this) {
            if (observers.contains(observer)) {
                observers.remove(observer);
                System.out.println(observer + " has withdrawn from bidding");
            }
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("New Bid Placed");
        for (Observer ob : observers)
            ob.update(ob, this.productName, this.bidAmount);
    }

    @Override
    public void setBidAmount(Observer observer, double newBidAmount) {
        if (bidAmount >= newBidAmount) {
            System.out.println("New Amount Can't be less than or equal to old bid.");
        } else {
            this.bidAmount = newBidAmount;
            notifyObservers();
        }

    }
}
