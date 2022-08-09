package com.design_patterns.creational.abstract_factory;

public class ICICI implements Bank{
    private final String bankName;
    public ICICI(){
        bankName="ICICI Bank";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
