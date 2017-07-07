package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger() {
        super("Deluxe", "spring roll", "elk", 7.55);
        super.addBurgerAddition1("Lays chips", 2.55);
        super.addBurgerAddition2("cola", 1.55);
    }

    @Override
    public void addBurgerAddition1(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void addBurgerAddition2(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void addBurgerAddition3(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void addBurgerAddition4(String name, double price) {
        System.out.println("No further additions allowed!");
    }
}
