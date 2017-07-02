package com.company;

public abstract class Animal {
    private int age;
    private int weight;
    private String gender;
    private String name;
    private String type;

    public Animal(int age, int weight, String gender, String name, String type) {
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.name = name;
        this.type = type;
    }

    public void about() {
        System.out.println("My name is " + name + " and I am " + age + " years old. I weigh " + weight + " pounds and I am a " + gender + " " + type + ".");
    }

    public void eat() {
        System.out.println("I am a " + type + " and I am eating.");
    }

    public void fly() {
        System.out.println("I am a " + type + " and I am currently in flight.");
    }

    public void running() {
        System.out.println("I am a " + type + " and I am running.");
    }

    public abstract void sprinting();

}
