package com.design_patterns.creational.abstract_factory;

public class BusinessLoan extends Loan {
    public void getInterestRate(double r) {
        rate = r;
    }
}