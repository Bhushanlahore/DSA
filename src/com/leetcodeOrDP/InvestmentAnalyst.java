package com.leetcodeOrDP;


//Investment Portfolios
//Emma works as a financial analyst and her supervisor has assigned her the task of analyzing N different investment portfolios.
//Each portfolio has a unique risk score. The supervisor has asked Emma to divide these consecutive portfolios into groups such
//that the total risk differential between all groups is maximized.The risk differential for a group is determined by the
//difference between the highest and lowest risk scores in that group. The supervisor also mentioned that if a group consists
//of only one portfolio, the risk differential should be considered as zero. You are given an integer N, representing the
//number of portfolios, and an integer array A, representing the risk scores of the portfolios. Your task is to help Emma
//maximize the total risk differential by returning an integer representing the maximum risk differential across all groups.
//
//Input Specification
//input1: An integer value N, representing the number of portfolios.
//input2: An integer array A, representing the risk scores of the
public class InvestmentAnalyst {
    public static int getMaxRiskDifferential(int N, int[] A) {
        // dp[i] stores the max risk differential for the first 'i' portfolios
        int[] dp = new int[N + 1];

        // Base case: dp[0] = 0 (no portfolios, no risk)

        for (int i = 1; i <= N; i++) {
            int currentMax = Integer.MIN_VALUE;
            int currentMin = Integer.MAX_VALUE;

            // Try all possible groups ending at index i-1
            // A group can start from index j and end at i-1
            for (int j = i; j >= 1; j--) {
                // Update max and min for the current sub-group A[j-1...i-1]
                currentMax = Math.max(currentMax, A[j - 1]);
                currentMin = Math.min(currentMin, A[j - 1]);

                int groupDiff = currentMax - currentMin;

                // DP relation: max of (previous best + current group's difference)
                dp[i] = Math.max(dp[i], dp[j - 1] + groupDiff);
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {
        int[] A = {10, 2, 8, 15, 6}; // Example unsorted array
        //2,6,8,10,15
        //4+2+2+5
        int N = A.length;

        System.out.println("Maximum Total Risk Differential: " + getMaxRiskDifferential(N, A));
    }
}

