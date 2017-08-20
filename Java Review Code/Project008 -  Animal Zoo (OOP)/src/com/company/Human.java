package com.company;

public class Human {
    private String name;
    private int age;
    private int heightInches;
    private String eyeColor;

    public Human(String name, int age, int heightInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInches + " inches tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ".");
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }

//    public void setAttr(String name, int age, int heightInches, String eyeColor) {
//        this.name = name;
//        this.age = age;
//        this. heightInches = heightInches;
//        this.eyeColor = eyeColor;
//    }
}
