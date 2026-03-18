package com.designpattern.decorator.example2;

public class SteamDecorator extends CoffeDecorator{

    public SteamDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }
}
