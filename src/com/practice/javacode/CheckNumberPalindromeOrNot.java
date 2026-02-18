package com.practice.javacode;

public class CheckNumberPalindromeOrNot {

    public static boolean checkNo(int number){

        int temp = 0;
        int num = number;

        while( num !=0) {
            int rem = num%10;
            temp = (temp * 10) + rem;
            num = num/10;
        }

        if(temp == number){
            return true;
        }
        return false;
    }

    public static void main(String args[]){

        System.out.print(checkNo(12112));
    }
}
