package com.company;

import javax.xml.bind.annotation.XmlType;

public class BankAccount {

    private int accNum;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    // default constructor if no args are passed.
    public BankAccount() {
        this(1010101, 15, "DEFAULT Name", "DEFAULT Address", "DEFAULT Phone");
    }

    public BankAccount(int accNum, double balance, String customerName, String email, String phone) {
        this.accNum = accNum;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void customerInfo() {
        System.out.println("Customer name is " + customerName + " and they have $" + balance + " in their account (No. " + accNum + ").");
        System.out.println("Contact info for " + customerName + " is " + email + ", " + phone + ".");
        System.out.println(" ");
    }

    public void deposit(double num) {
        this.balance += num;
        System.out.println("Previous balance for " + customerName + ": $" + balance);
        System.out.println(customerName + " has deposited $" + num);
        System.out.println("The new balance is $" + balance);
        System.out.println(" ");
    }

    public void withdraw(double num) {
        double newBalance;
        System.out.println("Previous balance for " + customerName + ": $" + balance);
        if (balance < num) {
            System.out.println("Cannot withdraw what you don't have!");
            System.out.println("The current balance is $" + balance);
        } else {
            newBalance = balance - num;
            System.out.println(customerName + " has withdrawn $" + num);
            balance = newBalance;
            System.out.println("The new balance is $" + balance);
        }
        System.out.println(" ");
    }


}
