package com.designpattern.observer;

public class EmailObserverImpl implements NotificationObserver{

   private final StockObserverable stockObserverable;
   private final String email;


   EmailObserverImpl(StockObserverable stockObserverable, String email){
       this.stockObserverable = stockObserverable;
       this.email = email;
   }


    @Override
    public void update() {
           sendMail(email, "Product is in Strock, Hurry Up");
    }

    void sendMail(String email, String msg){
        System.out.println(msg);
        System.out.println("Email send to "+email);
    }
}
