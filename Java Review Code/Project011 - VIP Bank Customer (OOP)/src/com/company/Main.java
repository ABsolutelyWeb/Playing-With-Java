package com.company;

public class Main {

    public static void main(String[] args) {
	    VIPCustomer cust1 = new VIPCustomer("Blue", 12);
        cust1.about();

        VIPCustomer cust2 = new VIPCustomer();
        cust2.about();

        VIPCustomer cust3 = new VIPCustomer("Red", 22, "red@r.com");
        cust3.about();

    }
}
