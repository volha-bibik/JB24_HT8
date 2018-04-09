package com.company.ht8;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addGoodToPayment(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void cost() {
        double cost = 0;
        for (Item item : this.getItems()) {
            if (item != null) {
                cost += (item.getPrice() * item.getAmount());
            }
        }
        System.out.println("Total price = " + cost);
    }
}
