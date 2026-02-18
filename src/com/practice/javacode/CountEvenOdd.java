package com.practice.javacode;

public class CountEvenOdd {

    public static int[] countNumbers(int arr[]){
        if(arr==null || arr.length ==0){
            throw new IllegalArgumentException("Array is empty");
        }
        int even = 0;
        int odd = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2== 0){
                even++;
            }else{
                odd++;
            }
        }

        return new int[]{even, odd};
    }

    public static void main(String args[]){

        int arr[] = {43,1,23,4,6,8,66,42,11,65};

        int[] ints = countNumbers(arr);

        System.out.println("even: "+ints[0]);
        System.out.println("odd: "+ints[1]);
    }
}
