package com.gyk.java.oop.basics;

public class LoansApplication {
    public static void main(String[] args) {

        Loan loanLeasing = new Loan(1,1000,LoanType.LEASING.label,"2027-12-31");
        Loan loanConsumer = new Loan(1,2000,LoanType.CONSUMER.label, "2026-12-31");
        Loan[] loans = new Loan[2];
        loans[0]=loanConsumer;
        loans[1]=loanLeasing;
        Customer customer = new Customer("Dainius","Milius","23","39905051111",loans);
        customer.customerInfo();
    }
}
