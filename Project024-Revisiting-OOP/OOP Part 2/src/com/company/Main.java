package com.company;

public class Main {

    public static void main(String[] args) {

        Nissan sentra2017 = new Nissan(1500, 15.5, "auto", "black", "Sentra 2017", true, true);
        System.out.println("Nissan " + sentra2017.getNissanType() + "'s current speed is " + sentra2017.getInitSpeed() + " mph.");
        System.out.println("The car has started: " + sentra2017.isStartState());
        sentra2017.selectGear("r", 20);
        sentra2017.startIgnition();
        sentra2017.selectGear("r", 20);
        System.out.println("Nissan " + sentra2017.getNissanType() + "'s current speed is " + sentra2017.getInitSpeed() + " mph.");
        sentra2017.selectGear("p", 20);
        sentra2017.steeringLeft();
        sentra2017.moveForward(50);
        System.out.println("Nissan " + sentra2017.getNissanType() + "'s current speed is " + sentra2017.getInitSpeed() + " mph.");
        sentra2017.moveForward(50);
        System.out.println("Nissan " + sentra2017.getNissanType() + "'s current speed is " + sentra2017.getInitSpeed() + " mph.");
        sentra2017.brake();
        System.out.println("Nissan " + sentra2017.getNissanType() + "'s current speed is " + sentra2017.getInitSpeed() + " mph.");
        sentra2017.selectGear("p", 0);
        sentra2017.stopIgnition();
    }
}


        // SAMPLE OUTPUT
//        Nissan Sentra 2017's current speed is 0 mph.
//        The car has started: false
//        Cannot change gears if car isn't on.
//        Car has started.
//        Moving back at 20mph.
//        Nissan Sentra 2017's current speed is -20 mph.
//        You cannot park while moving.
//        Car wheel has been turned to the left.
//        Nissan Sentra 2017's current speed is 30 mph.
//        Nissan Sentra 2017's current speed is 80 mph.
//        Nissan Sentra 2017's current speed is 0 mph.
//        Car is off.