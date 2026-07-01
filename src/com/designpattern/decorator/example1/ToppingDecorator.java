package com.designpattern.decorator.example1;

abstract class ToppingDecorator implements Pizza{

    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

}
