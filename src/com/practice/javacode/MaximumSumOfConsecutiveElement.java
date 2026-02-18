package com.practice.javacode;

public class MaximumSumOfConsecutiveElement {

    public static void maximumElement(int arr[], int k){

        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            // Shrink window if sum exceeds B
            while (currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            // Check if sum equals B
            if (currentSum == k) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                return;
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String args[]){

        int arr[] = {1,2,3,4};
        int k = 6;

        maximumElement(arr,k);
    }
}
