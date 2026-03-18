package com.designpattern.observer;

public class SMSObserverImpl implements NotificationObserver{

    private final StockObserverable stockObserverable;
    private String mobile;


    public SMSObserverImpl(StockObserverable stockObserverable, String mobile){
        this.stockObserverable = stockObserverable;
        this.mobile = mobile;
    }


    @Override
    public void update() {

        sendMail(mobile, "Product is in Strock, Hurry Up");
    }

    void sendMail(String mobile, String msg){

        System.out.println(msg);
        System.out.println("SMS send to "+mobile);
    }

}
