package com.designpattern.strategy;

import java.util.Map;

//in springboot we will use like this
//@Component
public class PaymentFactory {

    private Map<String, PaymentStrategy> strategies;

    public PaymentFactory(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public PaymentStrategy getStrategy(PaymentType type) {
        return strategies.get(type);
    }
}
