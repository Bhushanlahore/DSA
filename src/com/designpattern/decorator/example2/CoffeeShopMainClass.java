package com.designpattern.decorator.example2;

import com.designpattern.decorator.BasePizza;
import com.designpattern.decorator.Pizza;

public class CoffeeShopMainClass {

    public static void main(String args[]){


        System.out.println("======= Decorator Design Pattern ======");

        //Black coffee
        Coffee coffee1 = new BlackCoffee();
        System.out.println("Order 1: " + "Black Coffee =" + "Rs." + coffee1.getCost());

        //Black coffee with Suger
        Coffee coffee2 = new SugerDecorator(new BlackCoffee());
        System.out.println("Order 2: " + "Black Coffee wit sugar =" + "Rs." + coffee2.getCost());

        //Black coffee with Suger and milk
        Coffee coffee3 = new SugerDecorator(new MilkDecorator(new BlackCoffee()));
        System.out.println("Order 3: " + "Black Coffee with sugar and milk =" + "Rs." + coffee3.getCost());

    }
}
