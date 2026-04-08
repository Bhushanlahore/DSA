package com.a2z.easy;

/*
problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
Examples
Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
Output : [6, 7, 1, 2, 3, 4, 5]
Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5]

Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
Output : [3, 4, 5, 6, 1, 2]
Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
 */

public class Q5_6_otateArrayToLeft {

    public static void rotatElementBy1(int arr[]){
        int start = 0;
        int end = arr.length-1;

        rotateArray(start, end, arr);
        rotateArray(start, end-1, arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void rotateElementByK(int arr[], int k){

        int start = 0;
        int end = arr.length-1;

        rotateArray(start, end, arr);
        rotateArray(start, k-1, arr);
        rotateArray(k, end, arr);

        System.out.println();
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void rotateArray(int start, int end, int arr[]){
        while (start<end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int arr1[] = {1, 2, 3, 4, 5};

        rotatElementBy1(arr1);
        rotateElementByK(arr, 3);
    }
}
