package com.java_design_patterns.creational.abstract_factory;

public class BankFactory extends AbstractFactory {
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }
        if (bank.equalsIgnoreCase(BankNames.HDFC.name())) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase(BankNames.ICICI.name())) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase(BankNames.SBI.name())) {
            return new SBI();
        }
        return null;
    }

    public Loan getLoan(String loan) {
        // getLoan should return null here
        return null;
    }
}