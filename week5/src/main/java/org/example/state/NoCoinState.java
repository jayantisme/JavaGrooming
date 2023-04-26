package org.example.state;

public class NoCoinState implements CandyVendingMachineState{

    CandyVendingMachine machine;

    public NoCoinState(CandyVendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void pressButton() {
        System.out.println("No Coin Inserted");
    }

    @Override
    public void dispense() {
        System.out.println("No Coin Inserted");
    }

    @Override
    public String toString() {
        return "NoCoinState";
    }
}
