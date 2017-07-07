package com.company;

public class Main {

    public static void main(String[] args) {
        Burger b1 = new Burger("Basic", "wheat", "beef", 4.50);
        b1.addBurgerAddition1("lettuce", .10);
        b1.addBurgerAddition2("tomato", .40);
        b1.addBurgerAddition3("ketchup", .15);
        b1.addBurgerAddition4("avocado", .50);
        System.out.println("The burger price is $" + b1.itemizeBurger());

        System.out.println(" ");
        System.out.println("===================================================================================");
        System.out.println(" ");


        HealthyBurger h1 = new HealthyBurger("chicken", 3.50);
        h1.addBurgerAddition1("bacon", .35);
        h1.addBurgerAddition2("ranch", .25);
        h1.addBurgerAddition3("provolone cheese", .65);
        h1.addBurgerAddition4("siracha", .20);
        h1.addHealthyAddition1("kale", .45);
        h1.addHealthyAddition2("zuchinni", .75);
        System.out.println("The healthy burger price is $" + h1.itemizeBurger());


        System.out.println(" ");
        System.out.println("===================================================================================");
        System.out.println(" ");

        DeluxeBurger d1 = new DeluxeBurger();
        d1.addBurgerAddition1("blueberries", 1.55);
        System.out.println("The deluxe burger price is $" + d1.itemizeBurger());


    }
}
