package com.designpattern.decorator;

public class ChickenPizza implements Pizza{
    @Override
    public int getCost() {
        return 200;
    }
}
