package com.leetcodeOrDP;

//input=  {1,1,1,0,0,0};
//output = {1,0,1,0,1,0};
public class MoveZeroOne {
    public static void main(String args[]){

        int[] arr = {1,1,1,0,0,0};
        int[] output = new int[arr.length];

        int oneIndex = 0;
        int zeroIndex = 1;

        for(int num: arr){
            if(num ==1){
                output[oneIndex] = 1;
                oneIndex += 2;
            }else{
                output[zeroIndex] = 0;
                zeroIndex += 2;
            }
        }

        for(int i: output){
            System.out.print(i+" ");
        }
    }
}
