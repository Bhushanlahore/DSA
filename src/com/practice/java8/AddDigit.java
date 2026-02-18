package com.practice.java8;

public class AddDigit {

    public static void main(String args[]){

        int digit = 1234;

     int sum =  String.valueOf(digit).chars().map(n-> Character.getNumericValue(n)).sum();

     int sum2 = String.valueOf(digit).chars().map(Character::getNumericValue).sum();

     System.out.println(sum);
        System.out.println(sum2);
    }
}
