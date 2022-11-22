package com.gyk.java.oop.basics;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Dainius","Milius",ContractType.FULL_TIME.label,"2022-11-20",2000,"Programmer");

        employee.employeeInfo(employee);
    }
}
