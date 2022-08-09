package com.design_patterns.creational.abstract_factory;

import java.util.Arrays;
import java.util.Scanner;

public class AbstractFactoryCall {

    public void caller() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the name of the Bank: ");
        Arrays.stream(BankNames.values()).forEach(bankNames -> System.err.printf("%d - %s%n", bankNames.ordinal() + 1, bankNames.name()));
        String bankName = in.nextLine();

        System.out.println("Enter the type of the loan: ");
        Arrays.stream(LoanNames.values()).forEach(loanNames -> System.err.printf("%d - %s%n", loanNames.ordinal() + 1, loanNames.name()));
        String loanName = in.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("Enter the interest rate for ");
        System.err.print(b.getBankName() + ": ");
        double rate = in.nextDouble();

        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = in.nextDouble();

        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = in.nextInt();

        System.out.printf("you are taking the loan from %s ", b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);

        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}