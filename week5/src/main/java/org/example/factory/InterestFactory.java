package org.example.factory;

public class InterestFactory {
    public Interest getPlan(String planType) {
        if (planType == null)
            return null;
        else if (planType.equalsIgnoreCase("fd"))
            return new FD();
        else if (planType.equalsIgnoreCase("saving"))
            return new Saving();
        return null;
    }
}
