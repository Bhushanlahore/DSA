package com.practice.java8;

import java.util.List;

public class FindPairsUsingStreams {

    public static void main(String args[]){

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 6, 7, 8);
        int target = 10;

        list1.stream().flatMap(i-> list2.stream().filter(j -> i+j ==target).map(j-> List.of(i,j)))
                .forEach(System.out::println);


    }
}
