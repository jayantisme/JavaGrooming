package org.example.observer;

public interface Subject extends Registration, Notification{

    void setBidAmount(Observer observer, double newBidAmount);

}

