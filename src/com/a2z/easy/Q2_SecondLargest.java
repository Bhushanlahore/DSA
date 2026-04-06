package com.a2z.easy;

/*
Example 1:
Input: [1, 2, 4, 7, 7, 5]
Output:
Second Smallest : 2
Second Largest : 5
Explanation:The elements are sorted as 1, 2, 4, 5, 7, 7.
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:[1]
Output:
 Second Smallest : -1
 Second Largest : -1

Explanation: Since there is only one element in the array, it is both the largest and smallest element.
Therefore, there is no second smallest or second largest element present.
 */

public class Q2_SecondLargest {
    public static int secondLargestElement(int[] nums) {
        if(nums.length < 1 || nums == null){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]> max){
                secMax = max;
                max = nums[i];
            }else
            if( nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }else if (secMax == Integer.MIN_VALUE){
                secMax = -1;
            }
        }
        return secMax;
    }

    public static int secondSmallestElement(int[] nums) {
        if(nums.length < 1 || nums == null){
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){

            if(nums[i] < small){
                secSmall = small;
                small = nums[i];
            }else if(nums[i] < secSmall && nums[i] != small){
                    secSmall = nums[i];
            } else  if(secSmall == Integer.MAX_VALUE){
                secSmall = -1;
            }
        }
        return secSmall;
    }
    public static void main(String args[]){

        int arr[] = {1, 2, 4, 7, 7, 5};

        System.out.println(secondLargestElement(arr));
        System.out.println(secondSmallestElement(arr));

    }
}
