package com.designpattern.decorator;

public class ExtraCheezeTopping extends ToppingDecorator{


    public ExtraCheezeTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}
