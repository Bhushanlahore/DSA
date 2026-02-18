package com.searcgingalgo;

import java.util.HashMap;

public class TwoSome {

    //54,22,78,1,2,54,7;  target = 9
    public static int[] twoSumProblem(int arr[], int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

           int compliment = target - arr[i];

           if(map.containsKey(compliment)){

               return new int[]{compliment, arr[i]};
           }

           map.put(arr[i], 1);
        }

        return new int[]{-1, -1};
    }


    public static void main(String args[]){

        int arr[] = {54,22,78,1,2,54,7};

        int target = 9;

        int newInt[] = twoSumProblem(arr,target);

        System.out.println(newInt[0]+" "+newInt[1]);
    }
}
