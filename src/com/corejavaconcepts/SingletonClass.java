package com.corejavaconcepts;



public class SingletonClass {

    // THis is Lazy Initialization
//    private static SingletonClass instance;
//    private SingletonClass(){
//    }
//    public static SingletonClass getInstance(){
//        if(instance == null){
//            instance = new SingletonClass();
//        }
//        return instance;
//    }

    //option 3: Thread safe lay initialization Double check
    private static volatile  SingletonClass instance;
    private SingletonClass(){}
    public static synchronized SingletonClass getInstance(){
        if(instance == null){
            synchronized (SingletonClass.class){
                if(instance == null){
                    instance = new SingletonClass();
                }
            }
        }

        return instance;
    }

}
