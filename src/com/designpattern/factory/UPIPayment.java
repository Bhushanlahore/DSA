package com.designpattern.factory;

public class UPIPayment implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}
