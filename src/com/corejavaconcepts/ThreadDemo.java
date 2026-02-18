package com.corejavaconcepts;

class Thread1 extends  Thread{

    @Override
    public void run() {

        System.out.println("Thread1 class extends thread Class");
    }
}

class Thread2 implements  Runnable{

    @Override
    public void run() {

        System.out.println("Thread2 class implements Runnable Interface");
    }
}

public class ThreadDemo{

    public static void main(String args[]){

        Thread1 th = new Thread1();
        th.start();


        Thread t = new Thread(new Thread2());
        t.start();

        Thread t2 = new Thread(()->{

           System.out.println("Thread Class By Java 8");
        });
        t2.start();

        new Thread(()->{
            System.out.println("Thread Class By Java 8 m2");
        }).start();
    }
}
