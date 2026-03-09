package com.leetcodeOrDP;

import java.util.*;
//Combination Sum II using recursion.
public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public static void backtrack(int[] arr, int target, int start,
                                 List<Integer> temp,
                                 List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            temp.add(arr[i]);

            backtrack(arr, target - arr[i], i + 1, temp, result);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> ans = combinationSum2(candidates, target);

        System.out.println(ans);
    }
}
