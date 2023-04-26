package org.example.strategy;

public class Checkout {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("iPhone", 50000);
        Item item2 = new Item("OnePlus", 20000);

        cart.addItem(item1);
        cart.addItem(item2);

        // Card Payment
        cart.payment(new CardStrategy("123456789", "06/30", "555", "JAYANT"));

        // UPI Payment
        cart.payment(new UPIStrategy("jayant@axis", "123456"));
    }
}
