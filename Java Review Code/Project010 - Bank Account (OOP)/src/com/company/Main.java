package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount jonny = new BankAccount(175467, 10000, "Jonny", "jwow@gmail.com", "5108675309");
        jonny.customerInfo();
        jonny.deposit(4000);
        jonny.withdraw(9000);

        BankAccount jennifer = new BankAccount(8839, 2200, "Jennifer", "jennypenny@gmail.com", "5108775309");
        jennifer.customerInfo();
        jennifer.deposit(700);
        jennifer.withdraw(1000);
        jennifer.withdraw(10000);

        BankAccount def = new BankAccount();
        def.customerInfo();
        def.deposit(700);
        def.withdraw(10000);


    }
}
