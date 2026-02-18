package com.practice.thread;

public class ThreadDemo extends Thread{

    public static void main (String args []){

 //        Example 1: By Java 8
//        Thread thread = new Thread(() ->{
//
//            for(int i=0; i<5; i++){
//                System.out.println(i);
//            }
//        });
//
//        thread.start();

//
//        Example 2: By Implementing runnable interface
//        ThreadDemo threadDemo = new ThreadDemo();
//        Thread thread = new Thread(threadDemo);
//        thread.start();

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        new Thread(()->{

            for(int i=0; i<5; i++){
               System.out.print(i+" ");
        }
        }).start();
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
             System.out.println(i);
        }
    }
}
