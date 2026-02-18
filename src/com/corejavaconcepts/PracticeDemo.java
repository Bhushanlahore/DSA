package com.corejavaconcepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeDemo {

    public static int[] sumOfTwo(int arr[], int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int sum = target - arr[i];

            if(map.containsKey(sum)){
                return new int[]{map.get(sum), i};
            }else{
                map.put(arr[i], i);
            }
        }

        return new int[0];
    }

    public static int longestSubstirng(String str){

        int start = 0;
        int maxLength =0;

        Map<Character, Integer> map = new HashMap<>();

        for(int end =0; end < str.length(); end++){

            if(map.containsKey(str.charAt(end))){
                start =Math.max(end, map.get(str.charAt(end))+1);
            }
                map.put(str.charAt(end), 1);


            maxLength = Math.max(maxLength, end - start+1);
        }
                return maxLength;
    }

    public static int[] moveZero(int arr[]){
        //{0,1,0,3,12}
        //1,0,0,3,12
        int zero =0; //1

        for(int i =0; i<arr.length; i++){

            if(arr[i] != 0){
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                zero++;
            }
        }
        return arr;
    }

        public static boolean validAnagrams(String str1, String str2){
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
         return   Arrays.equals(ch1,ch2);
        }

    public static boolean validAnagrams2(String str1, String str2){

        if(str1.length() != str2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(char ch: str2.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)-1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() != 0)
                return false;
        }

        return true;
    }

    public static int maximumSubarray(int arr[]){

        int sum = arr[0];
        int maxSum =arr[0];

        for(int i=0; i<arr.length; i++){

            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0)
                sum =0;
        }
        return maxSum;
    }

    public static int maximumSubarray1(int arr[]){

        int currentSum = arr[0];
        int maxSum =arr[0];

        for(int i=1; i<arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(currentSum, maxSum);

        }
        return maxSum;
    }

    public static int minTeams(int teamSize1, int teamSize2, int p) {

        int big = Math.max(teamSize1, teamSize2);
        int small = Math.min(teamSize1, teamSize2);

        for (int y = p / big; y >= 0; y--) {

            int remaining = p - y * big;

            if (remaining % small == 0) {
                int x = remaining / small;
                return x + y;   // minimum teams
            }
        }

        return -1;
    }


    public static  void main(String args[]){

                int arr[] = {4,3,6,11,3,76,23};
                int target = 34;

              int newarr[] = sumOfTwo(arr, target);

              System.out.println(newarr[0]+" "+newarr[1]);

        for (int i : sumOfTwo(arr, target)) {

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=======================================");

        String str = "pwwkew";

        System.out.println(longestSubstirng(str));
        System.out.println("=======================================");

        int arr1[] = {0,1,0,3,12};

        for(int i: moveZero(arr1)){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("=======================================");

        System.out.println(validAnagrams("eat", "tea"));
        System.out.println(validAnagrams2("eat", "tea"));
        System.out.println("=======================================");
        int arr2[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr2));
        System.out.println("=======================================");
        int arr3[] = {-2,-3,-1,-5};
        System.out.println(maximumSubarray(arr3));

        System.out.println("=======================================");

        System.out.println(minTeams(3,4,6));

    }
}
