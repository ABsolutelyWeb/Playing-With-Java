package com.company;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String email;


    public VIPCustomer() {
        this("DEFAULT", 00, "default@gmail.com");
    }


    public VIPCustomer(String name, int creditLimit) {
        this(name, creditLimit, "default");
    }



    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public void about() {
        System.out.println("Name is " + name + ", Credit limit is " + creditLimit + ". Email is " + email);
    }
}
