package org.example.observer;

public interface Observer {
    void update(Observer observer, String productName, double bidAmount);
}
