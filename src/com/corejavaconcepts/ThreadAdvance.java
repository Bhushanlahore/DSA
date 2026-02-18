package com.corejavaconcepts;

import java.util.concurrent.*;

public class ThreadAdvance {


    public static Runnable insert(){

        return () -> {

            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        };

    }


    public static void main(String args[]) throws ExecutionException, InterruptedException {

        Runnable insert = insert();


        Callable<Integer> task = ()-> {
            System.out.println("Hi");
            return 10+20;
        };
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        Thread th = new Thread(futureTask);
        th.start();
        System.out.println(futureTask.get());

        ExecutorService excute = Executors.newSingleThreadExecutor();

        Future<Integer> submit = excute.submit(task);

        System.out.println(submit.get());
        excute.shutdown();

        int core = Runtime.getRuntime().availableProcessors();
        System.out.println(core);

        Thread.startVirtualThread(()->{

            System.out.println("hi");
        });

        ExecutorService executer = Executors.newVirtualThreadPerTaskExecutor();


    }
}

