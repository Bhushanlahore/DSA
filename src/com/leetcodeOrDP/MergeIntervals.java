package com.leetcodeOrDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals){

      //  Arrays.sort(intervals, (a,b)->a[0]-b[0]);

//        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        //{{1,3},{2,6},{8,15},{12,18},{17,19}}
        List<int[]> result = new ArrayList<>();
        int[] current= intervals[0];


        for(int i=1; i<intervals.length; i++){
                //2<3
            if(intervals[i][0] < current[1]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }else {
                result.add(current);
                current = intervals[i];
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);

    }

    public static void main(String args[]){

        int intervals[][] = {{1,3},{2,6},{8,15},{12,18},{17,19}};
      //  int intervals[][] = {{4,7},{1,4}};


        int[][] merged = merge(intervals);

      //  merge2(intervals);

       for(int[] interval : merged){
            System.out.println(Arrays.toString(interval));
        }
    }

    //{{1,3},{2,6},{8,15},{12,18},{17,19}};
    public static void merge2(int arr[][]){

        List<int[]> result = new ArrayList<>();

        int current[] = arr[0];

        for(int i=1; i<arr.length; i++){

            if(arr[i][0] < current[1]){
                current[1] = Math.max(current[1], arr[i][1]);
            }else{
                result.add(current);
                current = arr[i];
            }
        }

        result.add(current);

        for(int a[]: result){
            System.out.println(Arrays.toString(a));
        }
    }











}
