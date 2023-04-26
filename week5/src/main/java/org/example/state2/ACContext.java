package org.example.state2;

public class ACContext implements State{
    State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public void doAction() {
        this.currentState.doAction();
    }
}
