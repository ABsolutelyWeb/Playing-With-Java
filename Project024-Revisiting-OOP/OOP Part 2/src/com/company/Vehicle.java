package com.company;

public class Vehicle {

    private int weight;
    private String material;
    private int doors;
    private int seats;

    public Vehicle() {
        this(0, "Unknown", 0, 0);
    }

    public Vehicle(int weight, String material, int doors, int seats) {
        this.weight = weight;
        this.material = material;
        this.doors = doors;
        this.seats = seats;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public int getDoors() {
        return doors;
    }

    public int getSeats() {
        return seats;
    }
}
