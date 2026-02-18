package com.practice.java8;

import java.util.Arrays;
import java.util.List;

public class AddList {

    public static void main(String args[]){

        List<List<String>> lists = Arrays.asList(
                Arrays.asList("Java","Spring","SpringBoot"),
                Arrays.asList("React","Angular","Javascript"),
                Arrays.asList("sql","Mysql","oracle"));

        List<String> list1 = lists.stream().flatMap(list -> list.stream()).toList();

        System.out.println(list1);
    }


}
