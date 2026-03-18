package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObserverableImpl implements  StockObserverable{

    List<NotificationObserver> observers = new ArrayList<>();

    int stockCount =0;

    @Override
    public void add(NotificationObserver notificationObserver) {
                observers.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
                    observers.remove(notificationObserver);
    }

    @Override
    public void notifyObserver() {

        for(NotificationObserver observer: observers){
            observer.update();
        }
    }

    @Override
    public void setCount(int count) {

        if(stockCount == 0){
            notifyObserver();
            stockCount += count;
        }else{
            stockCount += count;
        }
    }

    @Override
    public int getCOunt() {
        return stockCount;
    }
}
