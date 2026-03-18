package com.designpattern.strategy;


public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying By CARD: "+amount);
    }
}
