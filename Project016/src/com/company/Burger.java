package com.company;

public class Burger {

    private String name;
    private String roll;
    private String meat;
    private double price;

    private String add1;
    private double add1Price;

    private String add2;
    private double add2Price;

    private String add3;
    private double add3Price;

    private String add4;
    private double add4Price;



    public Burger(String name, String roll, String meat, double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void addBurgerAddition1(String name, double price) {
        this.add1 = name;
        this.add1Price = price;
    }

    public void addBurgerAddition2(String name, double price) {
        this.add2 = name;
        this.add2Price = price;
    }

    public void addBurgerAddition3(String name, double price) {
        this.add3 = name;
        this.add3Price = price;
    }

    public void addBurgerAddition4(String name, double price) {
        this.add4 = name;
        this.add4Price = price;
    }

    public double itemizeBurger() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on a " + this.roll + " roll with a " + this.meat + " patty. Total price is $" + this.price);
        if (this.add1 != null)  {
            burgerPrice += this.add1Price;
            System.out.println("Added " + this.add1 + " for an extra $" + this.add1Price);
        }
        if (this.add2 != null)  {
            burgerPrice += this.add2Price;
            System.out.println("Added " + this.add2 + " for an extra $" + this.add2Price);
        }
        if (this.add3 != null)  {
            burgerPrice += this.add3Price;
            System.out.println("Added " + this.add3 + " for an extra $" + this.add3Price);
        }
        if (this.add4 != null)  {
            burgerPrice += this.add4Price;
            System.out.println("Added " + this.add4 + " for an extra $" + this.add4Price);
        }

        return burgerPrice;
    }
}
