package com.practice.javacode;

public class ReverseArray {

    public static int[] reverseArray1(int arr[]){
        int revArr[] = new int[arr.length];
        int j =0;
        for(int i=arr.length-1; i>=0; i--){
            revArr[j] = arr[i];
            j++;
        }
        return revArr;
    }

    public static int[] reverseArray2(int arr[]){
        int start =0;
        int end =arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {10,2,65,4,1,5,7,89};

        int revArr1[] = reverseArray1(arr);
        for(int i: revArr1){
            System.out.print(i+" ");
        }
        System.out.println();
        int revArr2[] = reverseArray2(arr);
        for(int i: revArr2){
            System.out.print(i+" ");
        }

    }
}
