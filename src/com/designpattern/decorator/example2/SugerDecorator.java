package com.designpattern.decorator.example2;

public class SugerDecorator extends CoffeDecorator{

    public  SugerDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost()+50;
    }
}
