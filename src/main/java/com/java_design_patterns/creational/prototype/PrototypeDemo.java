package com.java_design_patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employees employees = new Employees();
        employees.loadData();

        //Use the clone method to get the Employee object
        Employees employeesNew = (Employees) employees.clone();
        Employees employeesNew1 = (Employees) employees.clone();
        List<String> list = employeesNew.getEmpList();
        list.add("John");
        List<String> list1 = employeesNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("employees List: " + employees.getEmpList());
        System.out.println("employees New List: " + list);
        System.out.println("employees New 1 List: " + list1);
    }
}
