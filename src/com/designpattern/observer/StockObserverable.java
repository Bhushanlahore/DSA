package com.designpattern.observer;

public interface StockObserverable {

    void add(NotificationObserver notificationObserver);

    void remove(NotificationObserver notificationObserver);

    void notifyObserver();

    void setCount(int count);

    int getCOunt();
}
