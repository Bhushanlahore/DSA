package com.designpattern.observer;

public class WhatsappObserver implements NotificationObserver{

    private  final StockObserverable stockObserverable;
    private String wMobile;


    public WhatsappObserver(StockObserverable stockObserverable, String wMobile){
        this.stockObserverable = stockObserverable;
        this.wMobile = wMobile;
    }


    @Override
    public void update() {
        sendMail(wMobile, "Product is in Strock, Hurry Up");
    }

    void sendMail(String wmobile, String msg){

        System.out.println(msg);
        System.out.println("Whatsapp Notification send to "+wmobile);
    }
}
