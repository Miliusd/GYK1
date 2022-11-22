package com.gyk.java.oop.basics;

public class Employee {

    private String name;
    private String surname;
    private String contractType;
    private String contractStartDate;
    private int salary;
    private String postition;

    public Employee() {
    }

    public Employee(String name, String surname,String contractType, String contractStartDate, int salary, String postition) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.postition = postition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPostition() {
        return postition;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }

    @Override
    public String toString() {
        return "Employee name: "+name+"\n"+
                "Employee surname: "+surname+"\n"+
                "Contaract type: "+contractType+"\n"+
                "Contarct start date: "+contractStartDate+"\n"+
                "Employee salary: "+salary+"\n"+
                "Employee position: "+postition+"\n";
    }

    public void employeeInfo(Employee employee){
        System.out.println(employee);
    }
}
