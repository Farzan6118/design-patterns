package com.java_design_patterns.creational.factory;

import java.util.Arrays;
import java.util.Scanner;

public class FactoryCall {

    public void caller() {
        String firstTitle = "Enter the 'NAME' of the plan with which the bill will be generated: ";
        String secondTitle = "Enter the number of units for bill will be calculated: ";
        String printFormatText = "Bill amount for %s of %d units is: ";
        PlanFactory planFactory = new PlanFactory();
        Scanner in = new Scanner(System.in);

        Arrays.stream(PlanNames.values()).forEach(s -> System.out.printf("%d - %s%n", s.ordinal() + 1, s.name()));
        System.out.println(firstTitle);

        String planName = in.nextLine();

        System.out.print(secondTitle);
        int units = in.nextInt();

        Plan plan = planFactory.getPlan(planName);

        System.out.printf(printFormatText, planName, units);
        plan.getRate();
        plan.calculateBill(units);
    }
}