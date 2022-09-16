package com.java_design_patterns.creational.abstract_factory;

import java.util.Arrays;
import java.util.Scanner;

public class AbstractFactoryDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Arrays.stream(BankNames.values()).forEach(bankNames -> System.out.printf("%d - %s%n", bankNames.ordinal() + 1, bankNames.name()));
        System.out.println("Enter the 'NAME' of the Bank: ");
        String bankName = in.nextLine();

        Arrays.stream(LoanNames.values()).forEach(loanNames -> System.out.printf("%d - %s%n", loanNames.ordinal() + 1, loanNames.name()));
        System.out.println("Enter the 'TYPE_NAME' of the loan: ");
        String loanName = in.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        assert bankFactory != null;
        Bank b = bankFactory.getBank(bankName);

        System.out.print("Enter the interest rate for ");
        System.out.print(b.getBankName() + ": ");
        double rate = in.nextDouble();

        System.out.print("Enter the loan amount you want to take: ");
        double loanAmount = in.nextDouble();

        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = in.nextInt();

        System.out.printf("you are taking the loan from %s ", b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        assert loanFactory != null;
        Loan l = loanFactory.getLoan(loanName);

        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }

}
