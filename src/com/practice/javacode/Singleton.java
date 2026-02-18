package com.practice.javacode;

public class Singleton {

    //option 1: Eagar Initialization

//    private static final Singleton instance = new Singleton();
//
//    private Singleton(){}
//
//    public static Singleton getInstance(){
//        return  instance;
//    }

    //option 2: Lazy initialization

//    private   static  Singleton instance;
//    private Singleton(){};
//
//    public static Singleton getInstance(){
//        if(instance == null){
//
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //option 3: Thread safe lay initialization
    private static volatile Singleton instance;

    private Singleton(){}

    public static  Singleton getInstance(){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
