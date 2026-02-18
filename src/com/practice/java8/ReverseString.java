package com.practice.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String args[]){

        String str = "Bhushan";

       String reversed = IntStream.rangeClosed(1, str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length()-i)))
                .collect(Collectors.joining());

       System.out.println(reversed);


     String s1 =  IntStream.rangeClosed(1, str.length()).mapToObj(i-> String.valueOf(str.charAt(str.length()-i))).collect(Collectors.joining());

      System.out.println(s1);




    }
}
