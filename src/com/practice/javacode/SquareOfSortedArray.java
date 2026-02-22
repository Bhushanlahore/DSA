package com.practice.javacode;

import java.util.Arrays;

public class SquareOfSortedArray {

    public static  void main(String args[]){
        //Array Should be sorted;
        int arr[] = {-4, -1, 0, 3, 10};

        //Arrays.sort(arr);
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;

        for(int i= arr.length-1; i>0; i--){

            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                result[i] = arr[right] * arr[right];
                right--;
            }else{
                result[i] = arr[left] * arr[left];
                left++;
            }
        }

        for(int i: result){
            System.out.println(i);
        }
    }
}
