package org.example.state2;

public class ACOnState implements State{
    @Override
    public void doAction() {
        System.out.println("AC TURNED ON");
    }
}
