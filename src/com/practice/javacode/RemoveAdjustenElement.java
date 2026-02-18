package com.practice.javacode;

import java.util.Stack;

public class RemoveAdjustenElement {

    public  static void removeElement(int arr[]){

        Stack<Integer> st = new Stack<>();


        for(int i=0; i<arr.length; i++){

            if(!st.empty() && st.peek() == arr[i]){
                st.pop();
            }else{
                st.push(arr[i]);
            }
        }

        for(int i: st){
            System.out.println(i);
        }
    }

    public static void main(String args[]){

        int arr[]= {1,1,2,2,3,3,2};

        removeElement(arr);
    }
}
