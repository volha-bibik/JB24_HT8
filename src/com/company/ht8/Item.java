package com.company.ht8;

public class Item {
    private String name;
    private int price;
    private int amount;

    Item (String nName, int nPrice, int nAmount) {
        name = nName;
        price = nPrice;
        amount = nAmount;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
