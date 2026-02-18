package com.practice.javacode;

public class CheckStringPalindromeOrNot {

    public static boolean checkPalindrome(String str){

        int start = 0;
        int end = str.length()-1;
        char chars[] = str.toCharArray();
        while(start < end){
            if(chars[start] != chars[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String args[]){

        String str = "nacnbcan";

        System.out.println(checkPalindrome(str));
    }
}
