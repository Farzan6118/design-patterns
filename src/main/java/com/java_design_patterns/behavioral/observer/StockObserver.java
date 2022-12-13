package com.java_design_patterns.behavioral.observer;

public class StockObserver implements Observer {

    private static int observerIDTracer = 0;
    private final int observerID;
    private final StockGrabber stockGrabber;
    private double ibmPrice;
    private double applePrice;
    private double samsungPrice;

    public StockObserver(StockGrabber stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracer;

        System.out.println("new Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double samsungPrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.samsungPrice = samsungPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\napple: " + applePrice + "\nSamsung: " + samsungPrice + "\n");
    }
}
