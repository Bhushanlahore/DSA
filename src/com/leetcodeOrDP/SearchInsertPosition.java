package com.leetcodeOrDP;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid=0;

        while(start <= end){
           mid = start + ((end-start)/2);

            if(nums[mid] == target)
                return  mid;

            if(target > nums[mid])
                start = mid + 1;
             else
                 end = mid - 1;

        }
        return target > nums[mid]?mid+1:mid;
    }

    public static void main(String args[]){

        int arr[] =  {1,3};

        int target = 4;

        System.out.println(searchInsert(arr, target));
    }
}
