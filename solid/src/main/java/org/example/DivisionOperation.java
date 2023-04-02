package org.example;

public class DivisionOperation implements CalculatorOperation{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
