package com.design_patterns.creational.factory;

public class DomesticPlan extends Plan {

    @Override
    public void getRate() {
        super.rate = 2.50;
    }
}
