package com.practice.javacode;

public class ReverseString {

    public static String revString1(String str){
        String revString = "";
        for(int i=str.length()-1; i>=0; i--){
            revString += str.charAt(i);

        }
        return revString;
    }

    public static String revString3(String str){
        StringBuilder revString = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            //  revString += str.charAt(i);
            revString.append(str.charAt(i));
        }
        return revString.toString();
    }

    public static String revString2(String str){
        char charArray[] = str.toCharArray();
         int start =0;
         int end = str.length()-1;
         while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
         }
         return String.valueOf(charArray);
    }

    public static void main(String args[]){

        String str = "Bhushan";

        System.out.println(revString1(str));

        System.out.println(revString2(str));
    }
}
