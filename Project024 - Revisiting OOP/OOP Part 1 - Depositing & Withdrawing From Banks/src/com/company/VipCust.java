package com.company;

public class VipCust {

    private String vipName;
    private double creditLimit;
    private String vipEmail;

    public VipCust () {
        this("Jerry", 2321, "j@j.com");
        System.out.println("Called empty VipCust constructor.\n");
    }

    public VipCust (String vipName, String vipEmail) {
        this(vipName, 0, vipEmail);
    }

    public VipCust (String vipName, double creditLimit, String vipEmail) {
        this.vipName = vipName;
        this.creditLimit = creditLimit;
        this.vipEmail = vipEmail;
        System.out.println();
        System.out.println("Called primary VipCust constructor.");
    }

    public String getVipName() {
        System.out.println(vipName);
        return vipName;
    }

    public double getCreditLimit() {
        System.out.println(creditLimit);
        return creditLimit;
    }

    public String getVipEmail() {
        System.out.println(vipEmail);
        return vipEmail;
    }
}
