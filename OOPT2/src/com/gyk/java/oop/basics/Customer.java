package com.gyk.java.oop.basics;

public class Customer {
    private String name;
    private String surname;
    private String age;
    private String personalNumber;
    private Loan loans[];

    public Customer() {
    }

    public Customer(String name, String surname, String age, String personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public int calculateLoans() {
        int sum = 0;
        for (int i = 0; i < this.loans.length; i++) {
            sum += this.loans[i].getAmount();
        }
        return sum;
    }

    public void customerInfo() {
        System.out.println(
                "Customer name: " + this.name + "\n" +
                "Customer surname: " + this.surname + "\n" +
                "Customer age: " + this.age + "\n" +
                "Customer personal number: "+this.personalNumber+"\n"+
                "Customer loans: "+calculateLoans()
        );
    }
}
