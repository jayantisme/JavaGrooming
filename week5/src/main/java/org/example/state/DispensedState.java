package org.example.state;

public class DispensedState implements CandyVendingMachineState{
    CandyVendingMachine machine;

    public DispensedState(CandyVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin Already Inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("Button Already Pressed");
    }

    @Override
    public void dispense() {

    }

    @Override
    public String toString() {
        return "DispensedState";
    }
}
