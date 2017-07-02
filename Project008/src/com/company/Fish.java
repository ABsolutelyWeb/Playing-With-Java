package com.company;

public class Fish extends Animal {

    public Fish(int age, int weight, String gender, String name, String type) {
        super(age, weight, gender, name, type);
    }

//    public void about() {
//        System.out.println("I am a " + gender + ", " + color + " " + type + " fish. I am " + age + " years old." );
//    }
    public void swimming() {
        System.out.println("I enjoy swimming.");
    }
    public void exploring() {
        System.out.println("I enjoy exploring.");
    }
    public void hiding() {
        System.out.println("I have to hide from prey.");
    }
    public void leaping() { System.out.println("I can leap out of the water.");}

    public void sprinting() {
        System.out.println("Sprinting through water.");
    }
}
