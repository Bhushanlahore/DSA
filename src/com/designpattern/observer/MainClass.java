package com.designpattern.observer;

public class MainClass {

    public static void main(String args[]){

        IPhoneObserverableImpl iPhoneObserverable = new IPhoneObserverableImpl();

        EmailObserverImpl email = new EmailObserverImpl(iPhoneObserverable, "bhushan@gmail.com");
        SMSObserverImpl sms = new SMSObserverImpl(iPhoneObserverable, "8888336210");
        WhatsappObserver whatsapp = new WhatsappObserver(iPhoneObserverable, "8888336210");


        iPhoneObserverable.add(email);
        iPhoneObserverable.add(sms);
        iPhoneObserverable.add(whatsapp);
        iPhoneObserverable.setCount(100);

    }

}
