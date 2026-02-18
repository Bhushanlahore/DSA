package com.practice.javacode;

import java.util.Stack;

public class RemoveAdjustentCharacter {

    public static String removeCharacter(String str){

        Stack<Character> st = new Stack<>();

        for(char c: str.toCharArray()){


            if(!st.empty() && st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c: st){
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String args[]){

        String str = "abbaca";

        System.out.println(removeCharacter(str));
    }
}
