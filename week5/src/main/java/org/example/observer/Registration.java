package org.example.observer;

public interface Registration {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
}
