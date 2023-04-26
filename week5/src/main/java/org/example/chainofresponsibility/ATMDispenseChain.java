package org.example.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
    private DispenseChain c1;

    public ATMDispenseChain() {
        this.c1 = new Rupee500Dispenser();
        DispenseChain c2 = new Rupee200Dispenser();
        DispenseChain c3 = new Rupee100Dispenser();
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispense = new ATMDispenseChain();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int amount = 0;
            System.out.println("Enter Amount ");
            amount = sc.nextInt();
            if (amount%100 != 0){
                System.out.println("Amount should be multiple of 100");
                return;
            }
            atmDispense.c1.dispense(new Currency(amount));
        }
    }
}
