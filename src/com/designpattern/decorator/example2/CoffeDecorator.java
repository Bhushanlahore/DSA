package com.designpattern.decorator.example2;

abstract class CoffeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
