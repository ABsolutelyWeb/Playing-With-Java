package com.company;

public class WhaleShark extends Fish {

    public WhaleShark(int age, int weight, String gender, String name, String type) {
        super(age, weight, gender, name, type);
    }

    // overriding previous leaping method in super class
//    public void leaping() {
//        System.out.println("I cannot leap out of the water like a shark.");
//    }
    public void sprinting() {
        System.out.println("Slowly sprinting through water.");
    }
}
