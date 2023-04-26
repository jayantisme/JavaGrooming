package org.example.strategy;

public class UPIStrategy implements PaymentStrategy{
    String upiId;
    String otp;

    public UPIStrategy(String upiId, String otp) {
        this.upiId = upiId;
        this.otp = otp;
    }

    @Override
    public void amountToBePaid(double amount) {
        System.out.println(amount+" paid using UPI.");
    }
}
