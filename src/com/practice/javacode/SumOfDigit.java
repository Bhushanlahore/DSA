package com.practice.javacode;


//add the given number till it come to single digits
public class SumOfDigit {

    public static int sumOfDigit(int no){

        while(no>9){
            int sum =0;
            while(no >0){
                int rem = no%10;
                sum += rem;
                no = no/10;
            }
            no = sum;
        }
        System.out.println(no);
        return no;
    }


    public static void main(String args[]){

        int no = 12345;
        sumOfDigit(no);
    }
}
