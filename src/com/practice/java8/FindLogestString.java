package com.practice.java8;

import java.util.*;

public class FindLogestString {

    public static void main(String args[]){

        List<String> strings = Arrays.asList("Bhushan", null, "vinay", "mia");

        Optional<String> str = strings.stream().filter(Objects::nonNull).sorted(Comparator.comparingInt(String::length).reversed()).findFirst();

        String st= strings.stream().filter(Objects::nonNull).max(Comparator.comparingInt(String::length)).orElse("No elemnt found");

        System.out.println(str.get());

        String longest = "";

        for (String s : strings) {
            if (s != null && (longest == null || s.length() > longest.length())) {
                longest = s;
            }
        }
        	System.out.println(longest);

    }
}
