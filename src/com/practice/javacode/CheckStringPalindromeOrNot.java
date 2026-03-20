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

    public static boolean isPalindromeIgnoreSpacialCharacter(String s){

        //"A man, a plan, a canal: Panama"
        if (s == null) return false;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            // Skip non-alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]){
        String str = "nacnbcan";
        System.out.println(checkPalindrome(str));

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindromeIgnoreSpacialCharacter(s));

    }
}
