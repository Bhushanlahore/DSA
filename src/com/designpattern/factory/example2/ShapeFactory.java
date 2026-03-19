package com.designpattern.factory.example2;

public class ShapeFactory {

    public static Shape createShape(String tpye){

        if(tpye.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(tpye.equalsIgnoreCase("Square")){
            return new Square();
        }else{
            throw new IllegalArgumentException("Invalid  type");
        }
    }
}
