package com.design_patterns.creational.abstract_factory;

public class SBI implements Bank {
    private final String bankName;

    public SBI() {
        bankName = "SBI Bank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
