package org.example.observer;

public class BiddingApp {
    public static void main(String[] args) {

        // Setting Product Name and Initial Bid Amount
        Subject product = new Product("iPhone 5s", 10000);

        // Created three Observers
        Observer ob1 = new Bidder("Jayant");
        Observer ob2 = new Bidder("Arjun");
        Observer ob3 = new Bidder("Manish");

        // Registering All Observers
        product.registerObserver(ob1);
        product.registerObserver(ob2);
        product.registerObserver(ob3);

        // Adding New Bid
        product.setBidAmount(ob1, 15000);
        product.setBidAmount(ob2, 12000);

        // Removing Bidder
        product.removeObserver(ob2);

        // Adding New Bid
        product.setBidAmount(ob3, 18000);
    }
}
