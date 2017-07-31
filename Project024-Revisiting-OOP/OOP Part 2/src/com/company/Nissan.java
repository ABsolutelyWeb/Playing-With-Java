package com.company;

public class Nissan extends Car {

    private String nissanType;
    private boolean rearCameras;
    private boolean navigation;

    public Nissan(int weight, double steeringWheelSizeInInches, String transmissionType, String windowsTint, String nissanType, boolean rearCameras, boolean navigation) {
        super(weight, 4, steeringWheelSizeInInches, transmissionType, windowsTint, 4);
        this.nissanType = nissanType;
        this.rearCameras = rearCameras;
        this.navigation = navigation;
    }

    public String getNissanType() {
        return nissanType;
    }

    public boolean isRearCameras() {
        return rearCameras;
    }

    public boolean isNavigation() {
        return navigation;
    }
}
