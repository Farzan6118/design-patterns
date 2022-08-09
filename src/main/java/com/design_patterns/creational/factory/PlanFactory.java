package com.design_patterns.creational.factory;

public class PlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase(PlanNames.domesticPlan.name())) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase(PlanNames.commercialPlan.name())) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase(PlanNames.institutionalPlan.name())) {
            return new InstitutionalPlan();
        }
        return null;
    }

}
