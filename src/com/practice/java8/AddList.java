package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class

AddList {

    public static void main(String args[]){

        List<List<String>> lists = Arrays.asList(
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("React","Angular","Javascript"),
                Arrays.asList("sql","Mysql","oracle"));

        List<String> l1 = Arrays.asList("Java","Spring","SpringBoot");
        List<String> l2 = Arrays.asList("React","Angular","Javascript");
        List<String> l3 = Arrays.asList("sql","Mysql","oracle");


        List<String> list1 = lists.stream().flatMap(List::stream).toList();

       List<String> newList = Stream.of(l1,l2,l3).flatMap(List::stream).collect(Collectors.toList());

        List<String> newList2 = Arrays.asList(l1,l2,l3).stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(newList);
        System.out.println(newList2);
    }
}
