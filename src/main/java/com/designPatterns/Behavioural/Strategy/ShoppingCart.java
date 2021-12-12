package com.designPatterns.Behavioural.Strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    private int calculateTotal() {
        int sum = 0;
        //sum  = items.stream().map(Item::getPrice).mapToInt(Integer::intValue).sum();
		//sum  = items.stream().map(Item::getPrice).reduce(0, Integer::sum);
		//sum  = items.stream().map(Item::getPrice).reduce(0, (a,b) -> a+b);
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
