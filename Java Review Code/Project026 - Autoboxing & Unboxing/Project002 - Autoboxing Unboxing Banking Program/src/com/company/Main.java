package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        bank.addBranch("BOA: Cali");
        bank.addCustomer("BOA: Cali", "Blue", 23423.03);
        bank.addCustomer("BOA: Cali", "Red", 4341.23);
        bank.addCustomer("BOA: Cali", "Green", 441.65);

        bank.addBranch("BOA: Texas");
        bank.addCustomer("BOA: Texas", "Purple", 4141.65);

        bank.addCustTrans("BOA: Cali", "Red", 23.33);
        bank.addCustTrans("BOA: Texas", "Purple", 100.43);
        bank.addCustTrans("BOA: Cali", "Green", 1000.39);

        bank.listCustomers("BOA: Cali", true);
    }
}
