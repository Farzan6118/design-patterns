package com.java_design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

    private final List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double samsungPrice;
    public StockGrabber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer registerObserver) {
        observers.add(registerObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        if (observers.contains(deleteObserver)) {
            int index = observers.indexOf(deleteObserver);
            System.out.println("observer '" + (index+1) + "' have been unregistered");
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, applePrice, samsungPrice);
        }

    }

    public void setIBMPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setSamsungPrice(double samsungPrice) {
        this.samsungPrice = samsungPrice;
        notifyObserver();
    }

}
