package com.designpattern.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying By UPI: "+amount);
    }
}
