package com.leetcodeOrDP;

import java.util.Arrays;

public class Lottery {

    public static long solution(int N, long X, int Y, int[] prices) {
        Arrays.sort(prices);
        // Reverse to descending
        for (int i = 0; i < N / 2; i++) {
            int temp = prices[i];
            prices[i] = prices[N - 1 - i];
            prices[N - 1 - i] = temp;
        }

        long money = X;
        long totalBase = 0;

        for (int k = 0; k < N; k++) {
            long cost = (long) prices[k] * (1L << k); // prices[k] * 2^k
            if (money >= cost) {
                money -= cost;
                totalBase += prices[k];
            }
        }

        return totalBase * (1L << Y); // totalBase * 2^Y
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 46, 20, new int[]{7, 15, 11, 17}));   // 29360128
        System.out.println(solution(6, 44, 20, new int[]{5, 3, 6, 1, 2, 4})); // 16777216

    }
}