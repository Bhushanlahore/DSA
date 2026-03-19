package com.designpattern.factory;

public class PaymentFactory {

    public static Payment createPayment(String type){
        if(type.equalsIgnoreCase("CARD")){
            return new CardPayment();
        } else if(type.equalsIgnoreCase("UPI")){
            return new UPIPayment();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
