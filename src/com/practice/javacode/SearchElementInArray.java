package com.practice.javacode;

import java.util.Arrays;

public class SearchElementInArray {

    public static boolean searchElement1(int[] arr, int element){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == element)
                return true;
            }
        return false;
    }

    public static int searchElement2(int[] arr, int element){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == element) {
                System.out.println("element present at index: "+mid);
                return mid;
            }
            if(element > arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int arr1[] = {34,2,17,86,4,3,99,76};

        int arr2[] = {1,2,3,4,5,6,7,8,9};

        System.out.println(searchElement1(arr1,4));

        Arrays.sort(arr1);


        System.out.println(searchElement2(arr1, 86));

    }
}
