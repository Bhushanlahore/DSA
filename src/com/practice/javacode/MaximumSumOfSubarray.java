package com.practice.javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumOfSubarray {

    public static int findMaximumSUm(int arr[], int k){
        if(arr.length < k){
            return -1;
        }
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        int maxSum =windowSum;

        for(int i=k; i<arr.length; i++){
            windowSum = windowSum - arr[i-k] + arr[i];
           maxSum =  Math.max(windowSum, maxSum);
        }
        return maxSum;
    }

    public static List<Double> findAvarageofSubarray(int arr[], int k){
        List<Double> avgList = new ArrayList<>();

        if(arr == null || arr.length < k){
            return avgList;
        }

        int windowSum = 0;
        double avg = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        avgList.add((double) windowSum /k);

        for(int i=k; i<arr.length; i++){
            windowSum = windowSum - arr[i-k] + arr[i];

            avgList.add((double) windowSum /k);
        }

        return avgList;
    }

    public static void main(String args[]){

        int arr[] ={2, 1, 5, 1, 3, 2};

        System.out.println(findMaximumSUm(arr,3));
        System.out.println("Avarage List of subarray: "+findAvarageofSubarray(arr,3));
    }
}
