package com.company;

public class Bank {
    private int accNum;
    private  double balance;
    private String custName;
    private String email;
    private String phone;

    public Bank () {
        this(000, 0.00, "MISSING", "MISSING", "MISSING");
        System.out.println("Called empty Bank constructor.");
    }

    public Bank (int accNum, double balance, String custName, String email, String phone) {
        this.accNum = accNum;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
        System.out.println("Called primary Bank constructor.\n");
    }

    public void deposit(double dep) {
        this.balance += dep;
        System.out.println("You've deposited $" + dep + ".");
        System.out.println("Your total balance is $" + this.balance + ".");
        System.out.println();
    }

    public void withdraw(double withd) {
        if (this.balance >= withd) {
            this.balance -= withd;
            System.out.println("You've withdrawn $" + withd + ".");
            System.out.println("Your total balance is $" + this.balance + ".");
            System.out.println();
        } else {
            System.out.println("You do not have the sufficient funds to withdraw the amount of $" + withd);
            System.out.println("Your total balance is $" + this.balance + ".");
            System.out.println();
        }

    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
