package com.designpattern.factory;

public class CardPayment implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Cards");
    }
}
