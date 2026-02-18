package com.searcgingalgo;

import javax.swing.plaf.synth.SynthStyleFactory;

public class SelectionSort {

    public static int[] selectionSort(int arr[]){

        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static  void main(String args[]){

        int arr[] = {34,66,21,12,39,9};

        int newArr[] = selectionSort(arr);

        for(int i: newArr){
            System.out.print(i+" ");
        }
    }
}
