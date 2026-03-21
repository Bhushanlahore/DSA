package com.leetcodeOrDP;

public class CountI {
        public static void main(String[] args) {

            int[][] mat = {
                    {1,11,17,11},
                    {1,5,1,11},
                    {3,14,61,1},
                    {12,31,37,10}
            };

            int count = countIPatterns(mat);
            System.out.println(count);
        }

        static int countIPatterns(int[][] mat) {
            int n = mat.length;

            int m = mat[0].length;
            int count = 0;
            int maxSum = 0;

            for (int i = 0; i <= n - 3; i++) {
                for (int j = 0; j <= m - 3; j++) {

                    int sum = mat[i][j] +  mat[i][j+1] + mat[i][j+2] +mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2];

                    maxSum = Math.max(maxSum, sum);

//                    if (mat[i][j] == 1 && mat[i][j+1] == 1 && mat[i][j+2] == 1 &&
//                            mat[i+1][j+1] == 1 &&
//                            mat[i+2][j] == 1 && mat[i+2][j+1] == 1 && mat[i+2][j+2] == 1) {
//
//                        count++;
//                    }
                }
            }

            return maxSum;
        }

}
