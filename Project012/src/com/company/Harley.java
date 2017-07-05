package com.company;

public class Harley extends Motorcyle {
    private String color;
    private String model;

    public Harley(int passengers, String color, String model, int speed) {
        super(passengers, 2, speed);
        this.color = color;
        this.model = model;
    }

    @Override
    public void about() {
        super.about();
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
    }

    @Override
    public void revEngine() {
//        super.revEngine();
        System.out.println("Reving Harley engine.");
    }
}
