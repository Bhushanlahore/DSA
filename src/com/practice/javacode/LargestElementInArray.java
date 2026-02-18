package com.practice.javacode;

public class LargestElementInArray {

    public static int largestElement(int arr[]){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){

        int arr[] = {32,7,54,90,11,28,51,66};

        System.out.println(largestElement(arr));

    }
}
