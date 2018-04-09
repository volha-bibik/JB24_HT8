package com.company.ht8;

public class Main {
    public static void main(String args[]) {

        Payment payment = new Payment();
        payment.addGoodToPayment(new Item("Phone", 1000, 2));
        payment.addGoodToPayment(new Item("Laptop", 5000, 1));
        payment.addGoodToPayment(new Item("Phone", 800, 5));
        payment.cost();

    }
}
