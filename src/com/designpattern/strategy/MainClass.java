package com.designpattern.strategy;

public class MainClass {

    public static  void main(String args[]){

        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new UpiPayment());
        paymentService.processPayment(1000);

        paymentService.setPaymentStrategy(new CardPayment());
        paymentService.processPayment(1000);

        paymentService.setPaymentStrategy(new NetBanking());
        paymentService.processPayment(1000);
    }
}
