package com.practice.java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a program to convert the following string into a character array and sort it alphabetically:
public class SortAlphabetically {

    public static void main(String args[]) {
        String str = "I want to have a big meal today!";

        char ch[] = str.replaceAll(" ", "").trim().toCharArray();

        List<Character> collect = str.replaceAll(" ","").chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
