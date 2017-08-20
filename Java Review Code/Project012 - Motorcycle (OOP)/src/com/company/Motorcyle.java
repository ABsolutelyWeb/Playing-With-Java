package com.company;

public class Motorcyle extends LandMotorVehicle {

    private int handleBars;

    public Motorcyle(int passengers, int handleBars, int speed) {
        super(passengers, 2, 2, "motorcycle", 2, speed);
        this.handleBars = handleBars;

    }

    @Override
    public void about() {
        super.about();
        System.out.println("Handle Bars: " + handleBars);
    }

    public void revEngine() {
        System.out.println("Reving motorcycle engine.");
    }
}
