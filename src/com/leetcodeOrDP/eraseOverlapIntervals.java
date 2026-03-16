package com.leetcodeOrDP;

import java.util.Arrays;
import java.util.Comparator;

//Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
//Output: 1
//Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
public class eraseOverlapIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b)-> a[1]-b[1]);

        for(int[] i: intervals){

            System.out.println(Arrays.toString(i));
        }

        int[] current = intervals[0];

        int output = 0;

        for(int i=1; i<intervals.length; i++){

            if(intervals[i][0] < current[1]){
                output++;
            }
            else if(intervals[i][0] == current[0] && intervals[i][1] == current[1]){
                output++;
            }else{
                current = intervals[i];
            }
        }

        return output;
    }

    public static int eraseOverlapIntervals2(int[][] intervals) {

       // Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        // {{1,100},{11,22},{1,11},{2,12}};
        int current = intervals[0][1];
        int output = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (current > intervals[i][0])
                output++;
            else
                current = intervals[i][1];
        }
        return output;
    }
    public static void main(String args[]){

        int intervals[][] = {{1,100},{11,22},{1,11},{2,12}};

        System.out.println(eraseOverlapIntervals(intervals));

        System.out.println(eraseOverlapIntervals2(intervals));
    }
}
