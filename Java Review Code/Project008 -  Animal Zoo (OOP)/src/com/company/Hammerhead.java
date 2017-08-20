package com.company;

public class Hammerhead extends Fish implements Leapable {

    public Hammerhead(int age, int weight, String gender, String name, String type) {
        super(age, weight, gender, name, type);
    }

    public void leaping(){
        System.out.println("Hammerhead leaping out of the water.");
    }
    public void sprinting() {
        System.out.println("Rapidly printing through water.");
    }
}
