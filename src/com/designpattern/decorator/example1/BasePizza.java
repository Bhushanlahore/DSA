package com.designpattern.decorator.example1;

public class BasePizza implements Pizza{
    @Override
    public int getCost() {
        return 100;
    }
}
