package com.practice.javacode;

import java.util.Arrays;

public class TripletSum {

    public static int[] findTriplet(int arr[], int target){

        for(int i=0; i<arr.length-2; i++){
            int start = i+1;
            int end = arr.length-1;
            while(start < end){
                int sum = arr[i] + arr[start] + arr[end];
                if(sum == target){
                    return new int[]{arr[i], arr[start], arr[end]};
                }
                if(sum < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return new int[-1];
    }

    public static void main (String args[]){

        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;

     int arr1[] =   findTriplet(arr, target);

     for(int i: arr1){
         System.out.println(i);
     }
    }
}
