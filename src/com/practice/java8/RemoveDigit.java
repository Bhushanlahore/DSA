package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDigit {

    public static void main(String args[]){

        List<String> list = Arrays.asList("123", "1vdd", "345fdr", "12467", "avb", "hjg", "767","45","21","95");

        List<String> newList = list.stream()
                .map(s-> s.replaceAll("\\d", ""))
                .filter(s->!s.isEmpty()).collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> newList2 =   list.stream()
                                .filter(s-> s.matches("\\d+"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        System.out.println(newList2);

        List<Integer> newList3 =  list.stream()
                .map(s->s.replaceAll("\\D", ""))
                .filter(s->!s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(newList3);

        Map<Boolean, List<Integer>> collect = newList3.stream().collect(Collectors.partitioningBy(s -> s > 100));

        System.out.println(collect);
    }
}
