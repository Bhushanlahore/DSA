package com.a2z.easy;

/*
Move all Zeros to the end of the array
Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of
                    the array and move non-negative integers to the front by maintaining their order.
Examples
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
Input : 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */

public class Q7_MoveAllZeroToEnd {


    public static void moveZero(int arr[]) {
        int start = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            }
        }

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){

            int arr[] = {0,0,0,1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
            moveZero(arr);
    }
}
