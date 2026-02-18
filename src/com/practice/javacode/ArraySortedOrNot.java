package com.practice.javacode;

public class ArraySortedOrNot {

    public static boolean isSorted(int arr[]){

        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Array is empty");
        }
        boolean sorted = true;
        for(int i=0; i<arr.length-1; i++){

            if(arr[i] > arr[i+1]){
                sorted = false;
                return sorted;
            }
        }

        return sorted;
    }

    public static void main(String args[]){

        int arr[] = {1,4,3,4,6,6};

        System.out.println(isSorted(arr));
    }
}
