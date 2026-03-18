package com.designpattern.strategy;

public class PaymentService {

    PaymentStrategy paymentStrategy;

//    public PaymentService(PaymentStrategy paymentStrategy){
//        this.paymentStrategy = paymentStrategy;
//    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment( double amount){
        paymentStrategy.pay(amount);
    }


}
