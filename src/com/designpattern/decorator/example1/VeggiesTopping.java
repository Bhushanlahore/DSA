package com.designpattern.decorator.example1;

public class VeggiesTopping extends ToppingDecorator{

    public VeggiesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 70;
    }
}
