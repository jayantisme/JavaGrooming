package org.example.state;

public class ContainsCoinState implements CandyVendingMachineState{
    CandyVendingMachine machine;
    public ContainsCoinState(CandyVendingMachine machine){
        this.machine = machine;
    }

    @Override
    public String toString() {
        return "ContainsCoinState";
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin Is Inserted");
    }

    @Override
    public void pressButton() {

    }

    @Override
    public void dispense() {
        System.out.println("Press Button To Dispense");
    }
}
