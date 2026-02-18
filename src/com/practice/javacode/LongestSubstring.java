package com.practice.javacode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int longestSubstring(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int maxlength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            if (map.containsKey(str.charAt(right))) {
                left = Math.max(left, map.get(str.charAt(right)) + 1);
            }
            map.put(str.charAt(right), right);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
    public static void main(String args[]){
        System.out.println(longestSubstring("pwwkew"));

    }
}
