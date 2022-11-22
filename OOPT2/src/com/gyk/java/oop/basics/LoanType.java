package com.gyk.java.oop.basics;

public enum LoanType {
    LEASING("Leasing"),
    CONSUMER("Consumer");

    public final String label;

    private LoanType(String label){
        this.label=label;
    }
}
