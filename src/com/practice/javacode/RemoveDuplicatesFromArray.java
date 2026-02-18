package com.practice.javacode;

public class RemoveDuplicatesFromArray {
    //1,2,3,3,3,4,4,4,4
    public static int removeDuplicates(int arr[]){

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int start = 0;
        for(int end =1; end<arr.length; end++){

            if(arr[end] != arr[start]){
                start++;
                arr[start] = arr[end];
            }
            }

        return start+1;

    }

    public static void main(String args[]){

        int arr[] ={1,2,3,3,3,4,4,4,4,5,6,7,8,8};

        System.out.println(removeDuplicates(arr));
    }
}
