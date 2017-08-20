package com.company;

public class Deluxe extends BasicBurger {

    public Deluxe() {
        super("Deluxe", "spring roll", "elk", 7.55);
        super.add1ToBurger("Lays chips", 2.55);
        super.add2ToBurger("cola", 1.55);
    }

    @Override
    public void add1ToBurger(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void add2ToBurger(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void add3ToBurger(String name, double price) {
        System.out.println("No further additions allowed!");
    }

    @Override
    public void add4ToBurger(String name, double price) {
        System.out.println("No further additions allowed!");
    }
}