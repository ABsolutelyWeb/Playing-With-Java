package com.company;

public class Main {

    public static void main(String[] args) {
//	    LandMotorVehicle car1 = new LandMotorVehicle(6, 8, 8, "truck", 5);
//	    car1.about();

//        Motorcyle m1 = new Motorcyle(2, 2);
//        m1.about();

        Harley h1 = new Harley(1, "black", "Midnight", 50);
//        h1.about();
        h1.revEngine();
        h1.moveForward();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveBackwards();
        h1.moveLeft();
    }
}
