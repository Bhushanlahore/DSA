package com.designpattern.strategy;

public class NetBanking implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying By NetBanking: "+ amount);
    }
}
