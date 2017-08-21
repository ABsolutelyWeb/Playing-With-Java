package com.company;

public class Human {

    private String name;
    private int age;
    private int height;
    private String eyeColor;

    public Human(String name, int age, int height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speaking() {
        System.out.println("Hello! My name is " + this.name + ".");
        System.out.println("I am " + this.age + " years old.\n");
    }

    public void eating() {
        System.out.println(this.name + " is eating.\n");
    }

    public void walking() {
        System.out.println(this.name + " is walking.\n");
    }

    public void working() {
        System.out.println(this.name + " is working.\n");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
