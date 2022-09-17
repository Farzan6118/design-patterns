package com.java_design_patterns.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(144.0);
        stockGrabber.setApplePrice(199.5);
        stockGrabber.setSamsungPrice(122.3);

        StockObserver observer2 = new StockObserver(stockGrabber);
        StockObserver observer3 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(244.0);
        stockGrabber.setApplePrice(299.5);
        stockGrabber.setSamsungPrice(222.3);

        stockGrabber.unRegister(observer3);
        stockGrabber.unRegister(observer1);
        stockGrabber.unRegister(observer2);
    }
}
