package org.example.factory;

abstract class Interest {
    protected double rate;
    abstract void getRate();
    public void calculateInterest(double principal, int years) {
        double simpleInterest = (principal*rate*years) / 100;
        System.out.println("Total Amount = " + simpleInterest);
    }
}

class FD extends Interest {
    @Override
    void getRate() {
        rate = 7.1;
    }
}

class Saving extends Interest {
    @Override
    void getRate() {
        rate = 3;
    }
}
