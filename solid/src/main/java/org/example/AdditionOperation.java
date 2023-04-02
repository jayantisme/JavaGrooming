package org.example;

public class AdditionOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
