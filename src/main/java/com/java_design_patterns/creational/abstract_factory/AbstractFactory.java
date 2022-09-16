package com.java_design_patterns.creational.abstract_factory;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);

    public abstract Loan getLoan(String loan);
}
