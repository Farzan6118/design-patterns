package com.java_design_patterns.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    public ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
