package com.practice.java8;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateAndUniqueCharacter {

    public static  void main(String args[]) {

            String str = "112233334455678";

            Set<Character> seen = new HashSet<>();

      Set<Character> duplicate =  str.chars().mapToObj(c->(char) c).filter(n-> !seen.add(n)).collect(Collectors.toSet());

      System.out.println(seen);
        System.out.println(duplicate);



    }
}
