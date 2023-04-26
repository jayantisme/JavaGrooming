package org.example.chainofresponsibility;

public class Rupee100Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 100) {
            int num = currency.getAmount() / 100;
            int rem = currency.getAmount() % 100;
            System.out.println("Dispensing " + num + " ₹100 Note");
            if (rem != 0)
                this.chain.dispense(new Currency(rem));
        } else {
            this.chain.dispense(currency);
        }
    }
}
