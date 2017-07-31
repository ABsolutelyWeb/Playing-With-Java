package com.company;

public class LandMotorVehicle {

    // What does a general vehicle have?
    private  int passengers;
    private int seats;
    private int wheels;
    private String type;
    private int mirrors;
    private int speed;

    public LandMotorVehicle() {
        this(5, 4, 4, "car", 3, 50);
    }

    public LandMotorVehicle(int passengers, int seats, int wheels, String type, int mirrors, int speed) {
        this.passengers = passengers;
        this.seats = seats;
        this.wheels = wheels;
        this.type = type;
        this.mirrors = mirrors;
        this.speed = speed;
    }

    public void about() {
        System.out.println("Type: " + type);
        System.out.println("Passengers: " + passengers);
        System.out.println("Wheels: " + wheels);
        System.out.println("Seats: " + seats);
        System.out.println("Mirrors: " + mirrors);
        System.out.println("Current speed: " + speed);
    }

    public void moveForward() {
        this.speed += 10;
        System.out.println("Moving forward at " + this.speed + " mph.");
    }

    public void moveBackwards() {
        this.speed -= 10;
        if (this.speed < 0) {
            System.out.println("Moving backwards at " + Math.abs(this.speed) + " mph.");
        } else if (this.speed == 0) {
            System.out.println("Vehicle stopped.");
        } else {
            System.out.println("Slowing down at " + this.speed + " mph.");
        }
    }

    public void moveLeft() {
        System.out.println("Turning left at " + Math.abs(this.speed) + " mph.");
    }

    public void moveRight() {
        System.out.println("Turning right at " + this.speed + " mph.");
    }
}
