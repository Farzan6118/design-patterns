package com.design_patterns.creational.factory;

public class InstitutionalPlan extends Plan {

    @Override
    public void getRate() {
        super.rate = 1.50;
    }
}
