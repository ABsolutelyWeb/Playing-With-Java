package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String custName, double initialAmount) {
        if (findCust(custName) == null) {
            this.customers.add(new Customer(custName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustTrans(String custName, double amount) {
        Customer existingCust = findCust(custName);
        if (existingCust != null) {
            existingCust.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customer findCust(String custName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(custName)) {
                return checkedCustomer;
            }
        }
        return null;
    }
}
