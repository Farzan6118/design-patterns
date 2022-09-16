package com.java_design_patterns.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        ExpensiveObject expensiveObjectProxy = new ExpensiveObjectProxy();
        expensiveObjectProxy.process();
        expensiveObjectProxy.process();
        expensiveObjectProxy.process();
    }
}
