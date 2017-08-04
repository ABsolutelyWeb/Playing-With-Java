package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustTrans(String branchName, String custName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustTrans(custName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchname) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getBranchName().equals(branchname)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getBranchName());
            ArrayList<Customer> branchCust = branch.getCustomers();
            for (int i = 0; i < branchCust.size(); i++) {
                Customer branchCustomer = branchCust.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " [" + i + "]");
                if (showTransaction) {
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
