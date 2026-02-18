package com.searcgingalgo;

public class InsertionSort {

    public static int[] insertionSort(int arr[]){

        for (int i = 1; i <= arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }

        return  arr;


    }

    public static void main(String args[]) {

        int arr[] = {34, 66, 21, 12, 39, 9};

        int newArr[] = insertionSort(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
