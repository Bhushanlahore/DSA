package com.searcgingalgo;

public class BinarySearch {

    public static int findElement(int arr[], int key){

        System.out.println("method started");
        int start = 0;
        int end = arr.length-1;

       while(start <= end){

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

        int arr[] = {10,20,30,40,50,60,70,80,90};

       System.out.println( findElement(arr, 60));
    }
}
