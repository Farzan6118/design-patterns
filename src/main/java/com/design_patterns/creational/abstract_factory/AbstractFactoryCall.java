package com.design_patterns.creational.abstract_factory;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class AbstractFactoryCall {

    public void caller() {
        Scanner in = new Scanner(System.in);

        Arrays.stream(BankNames.values()).forEach(bankNames -> System.err.printf("%d - %s%n",bankNames.ordinal()+1,bankNames.name()));
        System.out.print("Enter the name of the Bank: ");
        String bankName = in.nextLine();

        Arrays.stream(LoanNames.values()).forEach(loanNames ->  System.err.printf("%d - %s%n",loanNames.ordinal()+1,loanNames.name()));
        System.out.print("Enter the type of the loan: ");
        String loanName = in.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.printf("Enter the interest rate for %s: ", b.getBankName());
        double rate = in.nextDouble();

        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = in.nextDouble();

        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = in.nextInt();

        System.out.printf("you are taking the loan from %s", b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);

        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}