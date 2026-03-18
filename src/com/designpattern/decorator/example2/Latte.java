package com.designpattern.decorator.example2;

public class Latte implements Coffee{
    @Override
    public int getCost() {
        return 200;
    }
}
