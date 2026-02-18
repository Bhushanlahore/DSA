package com.corejavaconcepts;

import java.util.concurrent.*;

public class ConcurrentHashmapDemo {

    private static final int NUM_THREAD = 5;
    private static final int MIN_INSERTION = 100;

    public static ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

    public static  Runnable insertRecord(){
        return ()->{

            for(int i=0; i<MIN_INSERTION; i++){
                map.put(i+Thread.currentThread().getName(), i);
            }
        };
    }
    public static  void main(String args[]) throws  InterruptedException{

        ExecutorService service = Executors.newFixedThreadPool(NUM_THREAD);

        for(int i=0; i<NUM_THREAD; i++){

            service.execute(insertRecord());
        }

        service.shutdown();

        //service.awaitTermination(1, TimeUnit.MINUTES);

    if(!service.isTerminated()){
            Thread.sleep(1000);
        }

        System.out.println("map size: "+map.size());

        System.out.println("map size: "+map.size());
    }

}
