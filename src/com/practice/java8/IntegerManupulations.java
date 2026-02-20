package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntegerManupulations {

    public static  void  main(String args[]){

        List<Integer> integerList = Arrays.asList(1,2,3,422,1,533,5,64,99,7,43,3,454,533);

        System.out.println("===============find second largest number from list way1====================");

      int secondLargest = integerList.stream().distinct().sorted((a,b)-> b-a).skip(1).findFirst().orElse(0);
      System.out.println(secondLargest);

      System.out.println("===============find second largest number from list way2====================");
      int secondLargest1 = integerList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondLargest1);

        System.out.println("===============find smallest largest number from list====================");
        int secondLargest2 = integerList.stream().distinct().sorted().skip(1).findFirst().orElse(-1);
        System.out.println(secondLargest2);

        System.out.println("===============find second largest number from array====================");
        int arr1[] = { 2, 45, 5, 49, 3, 4, 1, 2 };

        int secondLargest3 = Arrays.stream(arr1).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(secondLargest3);

    }
}
