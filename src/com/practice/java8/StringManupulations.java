package com.practice.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StringManupulations {


    public static void main(String args[]) {

        String str = "aabbccdfde";

        System.out.println("===============count the occurence of character in give Stirng=====================");
        System.out.println("**********Option 1*********");
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((key, value) -> {
            System.out.println(key + "==>" + value);
        });
        System.out.println("**********Option 2*********");

        Map<Character, Long> map2 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map2.forEach((key, value) -> {
            System.out.println(key + "==>" + value);
        });

        System.out.println("===============count the first non repeating character in give Stirng=====================");

        Map<String, Long> map3 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<String, Long> entry : map3.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + "====>" + entry.getValue());
                break;
            }
        }

        System.out.println("=====================================================================");

        List<String> list = Arrays.asList("banana", "apples", "orange", "pomogranate", "mango");

        System.out.println("===============Sort the string value in ascending order====================");

        List<String> sorteeList = list.stream().distinct().sorted().toList();
        System.out.println(sorteeList);

        System.out.println("===============Sort the string value in descending order====================");
        List<String> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList2);

        System.out.println("===============Sort the string value in ascending order based on length====================");
        List<String> sortedList3 = list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedList3);

        System.out.println("===============Sort the string value in descending order based on length====================");
        List<String> sortedList4 = list.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(sortedList4);

        System.out.println("===============first element of sorted list====================");
        String str1 = sortedList4.stream().findFirst().get();
        System.out.println(str1);

        String str2 = list.stream().sorted().skip(list.size()-2).findFirst().get();
        System.out.println(str2);

       String str3 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse("0");
       System.out.println(str3);
    }

}
