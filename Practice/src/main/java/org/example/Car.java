package org.example;

// Engine is mandatory part of Car
public class Car {
    private Engine engine;
    Car(){
        engine = new Engine();
    }
}

class Engine{}

