package org.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    void addItem(Item item){
        this.itemList.add(item);
    }

    void removeItem(Item item){
        this.itemList.remove(item);
    }

    public double calculateTotal(){
        if (itemList.isEmpty())
            return 0;
        double sum = 0;
        for (Item n : itemList)
            sum += n.getItemPrice();
        return sum;
    }

    void payment(PaymentStrategy paymentMethod){
        double amount = calculateTotal();
        paymentMethod.amountToBePaid(amount);
    }
}
