package com.java_design_patterns.creational.abstract_factory;

public class LoanFactory extends AbstractFactory {

    public Bank getBank(String bank) {
        // getBank should return null here
        return null;
    }

    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }
        if (loan.equalsIgnoreCase(LoanNames.Home.name())) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase(LoanNames.Business.name())) {
            return new BusinessLoan();
        } else if (loan.equalsIgnoreCase(LoanNames.Education.name())) {
            return new EducationLoan();
        }
        return null;
    }

}