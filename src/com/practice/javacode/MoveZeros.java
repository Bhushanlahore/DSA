package com.practice.javacode;

public class MoveZeros {

    public static void main(String args[]){

            int arr[] = {0,6,3,0,0,1,2,7};

            int start = 0;

                for(int i=0; i<arr.length; i++){

                    if(arr[i] != 0){

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

}
