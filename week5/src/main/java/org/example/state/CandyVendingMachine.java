package org.example.state;

public class CandyVendingMachine {
    CandyVendingMachineState noCoinState;
    CandyVendingMachineState noCandyState;
    CandyVendingMachineState dispensedState;
    CandyVendingMachineState containsCoinState;
    CandyVendingMachineState currentState;
    int candyCount;

    public CandyVendingMachine(int candyCount) {
        this.candyCount = candyCount;
        noCoinState = new NoCoinState(this);
        noCandyState = new NoCandyState(this);
        dispensedState = new DispensedState(this);
        containsCoinState = new ContainsCoinState(this);
        currentState = noCoinState;
    }

    public void refillCandy(int candyCount) {
        this.candyCount = candyCount;
        this.currentState = noCoinState;
    }

    public void ejectCandy() {
        if (candyCount > 0)
            candyCount--;
    }

    public void insertCoin(){
        System.out.println("Coin Inserted Successfully");
        currentState.insertCoin();
    }

    public void pressButton(){
        System.out.println("You Have Pressed The Button");
        currentState.pressButton();
        currentState.dispense();
    }

    public CandyVendingMachineState getNoCoinState() {
        return noCoinState;
    }

    public void setNoCoinState(CandyVendingMachineState noCoinState) {
        this.noCoinState = noCoinState;
    }

    public CandyVendingMachineState getNoCandyState() {
        return noCandyState;
    }

    public void setNoCandyState(CandyVendingMachineState noCandyState) {
        this.noCandyState = noCandyState;
    }

    public CandyVendingMachineState getDispensedState() {
        return dispensedState;
    }

    public void setDispensedState(CandyVendingMachineState dispensedState) {
        this.dispensedState = dispensedState;
    }

    public CandyVendingMachineState getContainsCoinState() {
        return containsCoinState;
    }

    public void setContainsCoinState(CandyVendingMachineState containsCoinState) {
        this.containsCoinState = containsCoinState;
    }

    public CandyVendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(CandyVendingMachineState currentState) {
        this.currentState = currentState;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void setCandyCount(int candyCount) {
        this.candyCount = candyCount;
    }

    @Override
    public String toString() {
        return "Current state of machine "+currentState +". Candies available "+candyCount;
    }
}
