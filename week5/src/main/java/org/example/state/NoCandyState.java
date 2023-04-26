package org.example.state;

public class NoCandyState implements CandyVendingMachineState{
    CandyVendingMachine machine;

    public NoCandyState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("No Candies Available");
    }

    @Override
    public void pressButton() {
        System.out.println("No Candies Available");
    }

    @Override
    public void dispense() {
        System.out.println("No Candies Available");
    }

    @Override
    public String toString() {
        return "NoCandyState";
    }
}
