package com.designpattern.decorator;

abstract class ToppingDecorator implements Pizza{

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

}
