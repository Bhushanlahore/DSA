package com.designpattern.decorator.example1;

public class MashroomTopping extends ToppingDecorator{

   public MashroomTopping(Pizza pizza){
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
