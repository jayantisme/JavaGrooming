package org.example.state2;

public class ACRemote {
    public static void main(String[] args) {
        ACContext context = new ACContext();
        ACOnState acOnState = new ACOnState();
        ACOffState acOffState = new ACOffState();

        context.setCurrentState(acOnState);
        context.doAction();

        context.setCurrentState(acOffState);
        context.doAction();
    }
}
