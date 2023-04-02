package org.example;

public class SubstractionOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
