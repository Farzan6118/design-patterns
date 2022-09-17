package com.java_design_patterns.behavioral.observer;

public interface Subject {

    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObserver();

}
