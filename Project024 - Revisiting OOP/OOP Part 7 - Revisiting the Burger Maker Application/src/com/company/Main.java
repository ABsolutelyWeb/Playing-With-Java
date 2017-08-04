package com.company;

public class Main {

    public static void main(String[] args) {
        GardenBurger gardenBurger = new GardenBurger("veggie", 4.0);
        gardenBurger.add1ToGarden("kale", 1);
        gardenBurger.add2ToGarden("spinach", 2);
        gardenBurger.add1ToBurger("fries", 1.5);
        System.out.println("Total price for " + gardenBurger.getName() + " is $" + gardenBurger.totalBurgerPrice());
    }
}
