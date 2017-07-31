package com.company;

public class Dog extends Animal {

    private int legs;
    private int eyes;
    private int tail;
    private String coat;
    private int teeth;

    public Dog() {
        this("Unknown", 0,0, 0, 0, 0, "Unknown", 0);
//        System.out.println("Empty Dog constructor called.");
    }

    public Dog(String name, int size, double weight, int legs, int eyes, int tail, String coat, int teeth) {
        super(name, size, 1, 1, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
    }

    public void chewBone() {
        System.out.println("chewBone() from Dog class was called for the " + getName() + " object.");
    }

    @Override
    public void eat() {
        System.out.println("I am object " + getName() + " and I am a Dog eating.");
        chewBone();
        super.eat();
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(25);
    }

    public void walk() {
        System.out.println("Dog.walk called.");
        move(3);
    }
}
