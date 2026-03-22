package com.leetcodeOrDP;

import java.util.Arrays;

/**
 * LongestCommonPrefix - Find the longest common prefix string amongst an array of strings.
 *
 * @param strs strs an array of strings to find the common prefix from
 * @return the longest common prefix string; returns empty string "" if no common prefix exists
 *
 * @example
 * Input: ["flower", "flow", "flight"]
 * Output: "fl"
 */

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
            String prefix = strs[0];
            for(int i=1; i<strs.length; i++) {
                while (!strs[i].startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);

                    if (prefix.isEmpty())
                        return "";
                }
            }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] strs){

        int index =0;
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        while(index<s1.length() && index<s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }

        return s1.substring(0,index);
    }


    public static void main(String args[]){

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

        System.out.println(longestCommonPrefix2(strs));
    }
}
