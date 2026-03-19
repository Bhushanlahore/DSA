package com.designpattern.factory;

public class PaymentMainClass {

    public static void main(String[] args) {

        Payment p1 = PaymentFactory.createPayment("CARD");
        p1.pay(1000);

        Payment p2 = PaymentFactory.createPayment("UPI");
        p2.pay(2000);
    }
}
