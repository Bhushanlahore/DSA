package com.practice.java8;

import java.util.Arrays;

//Write a program to take an array of integer and then square it and then find number greater than 100 and then average
// it using Stream.
public class Question1 {

    public static double getAvarage(int[] arr){
        return Arrays.stream(arr).map(n -> n * n).filter(n -> n > 100).average()
                        .orElseThrow(()-> new IllegalArgumentException("No value greater than 100"));
    }
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,10};

        System.out.println(getAvarage(arr));
    }
}
