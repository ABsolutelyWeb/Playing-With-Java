package com.company;

public class Car extends Vehicle {

    private double steeringWheelSizeInInches;
    private String transmissionType;
    private String windowsTint;
    private int wheels;
    private int initSpeed;
    private boolean startState;

    public Car(int weight, int doors, double steeringWheelSizeInInches, String transmissionType, String windowsTint, int wheels) {
        super(weight, "metal", doors, 5);
        this.steeringWheelSizeInInches = steeringWheelSizeInInches;
        this.transmissionType = transmissionType;
        this.windowsTint = windowsTint;
        this.wheels = wheels;
        this.initSpeed = 0;
        this.startState = false;
    }

    public void startIgnition() {
        this.startState = true;
        System.out.println("Car has started.");
    }

    public void stopIgnition() {
        this.startState = false;
        System.out.println("Car is off.");
    }



    public void selectGear(String gear, int speed) {
        if (this.startState == true) {
            if (gear.toLowerCase() == "r") {
                System.out.println("Moving back at " + moveBackward(speed) + "mph.");

            } else if (gear.toLowerCase() == "d") {
                System.out.println("Moving forward at " + moveForward(speed) + "mph.");

            } else if (gear.toLowerCase() == "p") {
                if (this.initSpeed != 0) {
                    System.out.println("You cannot park while moving.");
                } else {
                    System.out.println("Vehicle is in park mode.");
                }
            }
        } else {
            System.out.println("Cannot change gears if car isn't on.");
        }
    }

    public void brake() {
        this.initSpeed = 0;
    }


    public void steeringLeft() {
        System.out.println("Car wheel has been turned to the left.");
    }

    public void steeringRight() {
        System.out.println("Car wheel has been turned to the right.");
    }

    public int moveForward(int speed) {
        this.initSpeed += speed;
        return this.initSpeed;
    }

    public int moveBackward(int speed) {
        this.initSpeed -= speed;
        return Math.abs(this.initSpeed);
    }


    public int getInitSpeed() {
        return initSpeed;
    }

    public boolean isStartState() {
        return startState;
    }

    public double getSteeringWheelSizeInInches() {
        return steeringWheelSizeInInches;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getWindowsTint() {
        return windowsTint;
    }

    public int getWheels() {
        return wheels;
    }
}
