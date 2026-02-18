package com.practice.javacode;

public class findSecondLargestElement {

    public static int findSecondLargest(int arr[]){

        if (arr == null || arr.length < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else
                if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            return -1; // no second distinct largest
        }
        return secondMax;

    }

    public static void main(String args[]){

        int arr[] = {34,7,3,11,39,87,50,32};

        System.out.println(findSecondLargest(arr));
    }
}
