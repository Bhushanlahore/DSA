package com.designpattern.decorator;

public class BasePizza implements Pizza{
    @Override
    public int getCost() {
        return 100;
    }
}
