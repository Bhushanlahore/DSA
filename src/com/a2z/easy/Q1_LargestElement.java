package com.a2z.easy;

/*
Example 1:
Input:
arr[] = {2, 5, 1, 3, 0}
Output:5
Explanation: 5 is the largest element in the array.

Example 2:
Input:
arr[] = {8, 10, 5, 7, 9}
Output:10
Explanation:10 is the largest element in the array.
*/

public class Q1_LargestElement {

    public static  int getLargestElement(int arr[]){

        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){

       int arr[] = {2, 5, 1, 3, 0};

        System.out.println(getLargestElement(arr));
    }
}
