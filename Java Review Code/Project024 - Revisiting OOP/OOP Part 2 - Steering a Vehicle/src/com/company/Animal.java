package com.company;

public class Animal {
    private String name;
    private int size;
    private int brain;
    private int body;
    private double weight;

    public Animal(String name, int size, int brain, int body, double weight) {
        this.name = name;
        this.size = size;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public double getWeight() {
        return weight;
    }

    public void eat () {
        System.out.println("I am object " + getName() + " and I am an Animal eating.");
    }

    public void move (int speed) {
        System.out.println("Animal moving at " + speed + " mph.");
    }
}
