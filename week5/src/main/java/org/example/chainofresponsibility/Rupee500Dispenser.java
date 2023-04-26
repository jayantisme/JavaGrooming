package org.example.chainofresponsibility;

public class Rupee500Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 500) {
            int num = currency.getAmount() / 500;
            int rem = currency.getAmount() % 500;
            System.out.println("Dispensing " + num + " ₹500 Note");
            if (rem != 0)
                this.chain.dispense(new Currency(rem));
        } else {
            this.chain.dispense(currency);
        }
    }
}
