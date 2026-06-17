package com.searcgingalgo;

public class BinarySearch {

    public static int findElement(int arr[], int key){

        System.out.println("method started");
        int start = 0;
        int end = arr.length-1;

       while(start < end){

           int mid = (start+end)/2;
           if(key == arr[mid]){
               System.out.println("Element found on index: "+mid);
               return mid;
           }

           if(key > arr[mid]){
               start = mid+1;
           }else{
               end = mid-1;
           }
       }
            return 0;
    }
    public static void main(String args[]){

        int arr[] = {1,3,5,6, 9,10,23,26,87};

       System.out.println( findElement(arr, 26));
    }
}
