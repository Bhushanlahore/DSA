package com.practice.pattern;
//       *
//      ***
//     *****
//    *******


public class Pattern1 {


    public static void pattern(int num){

        for(int i=1; i<num; i++){

            for(int j=1; j<num-i+1; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-2; i>0; i--){

            for(int j=1; j<num-i+1; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        pattern(10);
    }
}
