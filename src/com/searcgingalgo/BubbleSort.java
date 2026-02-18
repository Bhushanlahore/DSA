package com.searcgingalgo;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){

        for(int i=1; i<arr.length; i++){

            boolean swapped = false;
            for(int j=0; j<arr.length-i; j++){
                int temp =0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

        return arr;
    }

    public static void main(String args[]){

        int arr[] = {34,66,21,12,39,9};

        int newArr[] = bubbleSort(arr);

        for(int i: newArr){
            System.out.print(i+" ");
        }
    }
}
