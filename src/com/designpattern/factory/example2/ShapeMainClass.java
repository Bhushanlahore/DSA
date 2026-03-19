package com.designpattern.factory.example2;

public class ShapeMainClass {

    public static void main(String args[]){

            Shape s1 = ShapeFactory.createShape("circle");
            s1.draw();

            Shape s2 = ShapeFactory.createShape("square");
            s2.draw();
    }
}
