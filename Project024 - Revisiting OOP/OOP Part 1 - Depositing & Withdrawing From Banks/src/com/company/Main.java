package com.company;

public class Main {

    public static void main(String[] args) {
//        Bank garryAccount = new Bank(7876, 1000, "Garry", "g@g.com", "555-555-5555");
//        garryAccount.deposit(12.32);
//        garryAccount.withdraw(500);
//        garryAccount.withdraw(10000);
//        System.out.println(garryAccount.getBalance());

        VipCust unknown = new VipCust();
        unknown.getCreditLimit();
        unknown.getVipEmail();
        unknown.getVipName();

        VipCust jondoe = new VipCust("John", "j@d.com");
        jondoe.getCreditLimit();
        jondoe.getVipEmail();
        jondoe.getVipName();

        VipCust blah = new VipCust("Blah", 20202, "b@lah.com");
        blah.getCreditLimit();
        blah.getVipEmail();
        blah.getVipName();


    }
}
