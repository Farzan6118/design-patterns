package com.design_patterns.creational.factory;

public class CommercialPlan extends Plan {

    @Override
    public void getRate() {
        super.rate = 3.50;
    }

}
