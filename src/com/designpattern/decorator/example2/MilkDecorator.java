package com.designpattern.decorator.example2;

public class MilkDecorator extends CoffeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public int getCost() {
        return coffee.getCost() + 80;
    }
}
