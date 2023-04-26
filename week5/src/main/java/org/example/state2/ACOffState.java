package org.example.state2;

public class ACOffState implements State{
    @Override
    public void doAction() {
        System.out.println("AC TURNED OFF");
    }
}
