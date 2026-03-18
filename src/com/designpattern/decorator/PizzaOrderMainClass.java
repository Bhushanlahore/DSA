package com.designpattern.decorator;

public class PizzaOrderMainClass {

    public static  void main(String args[]){

        System.out.println("======= Decorator Design Pattern ======");
        // Create a plain pizza
        Pizza pizza1 = new BasePizza();
        System.out.println("Order 1: " + "BasePizza - Base Pizza =" + "Rs." + pizza1.getCost());

        // Add toppings to the PlainPizza - Extra Cheese Only
        Pizza pizza2 = new ExtraCheezeTopping(new BasePizza());
        System.out.println("Order 2: " + "BasePizza - Extra Cheeze =Rs." + pizza2.getCost());

        //Add topping to the BasePizza - Mashroom and ExtraCheeze
        Pizza pizza3 =  new MashroomTopping(new ExtraCheezeTopping(new BasePizza()));
        System.out.println("Order 3: " + "BasePizza - Mashroom and ExtraCheeze =Rs." + pizza2.getCost());

        //Add topping to the BasePizza - Mashroom and ExtraCheeze and veggies
        Pizza pizza4 =  new MashroomTopping(new ExtraCheezeTopping(new BasePizza()));
        System.out.println("Order 4: " + "BasePizza - Mashroom and ExtraCheeze and veggies =Rs." + pizza2.getCost());

        //Add topping to the FarmHouse - Mashroom and Veggies
        Pizza pizza5 = new VeggiesTopping(new MashroomTopping(new FarmHouse()));
        System.out.println("Order 5: " + "FarmHouse - Mashroom and Veggies  =Rs." + pizza2.getCost());


    }
}
