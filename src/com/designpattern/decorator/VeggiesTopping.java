package com.designpattern.decorator;

public class VeggiesTopping extends ToppingDecorator{

    public VeggiesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 70;
    }
}
