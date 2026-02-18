package com.practice.javacode;

public class FindMissingElement {

    public static int missingElement(int arr[], int n){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int arraySum = n*(n+1)/2;
        int actualSum =0;

        for(int i: arr){
            actualSum += i;
        }
        return arraySum - actualSum;
    }

    public static void main(String args[]){

        int arr[] = {4};
        System.out.println(missingElement(arr, arr.length+1));
    }
}
