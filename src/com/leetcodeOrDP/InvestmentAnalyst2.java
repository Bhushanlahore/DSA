package com.leetcodeOrDP;

import java.util.Arrays;



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

public class InvestmentAnalyst2  {
        public static int maxRisk(int[] A, int N) {

            if(N <= 1){
                return 0;
            }

            Arrays.sort(A);

            int total = 0;

            for (int i = 1; i < N; i++) {
                total += (A[i] - A[i - 1]);
            }

            return total;
        }

        public static void main(String[] args) {

            int[] A = {10, 2, 8, 15, 6};
            int N = A.length;

            System.out.println(maxRisk(A, N));
        }

}
