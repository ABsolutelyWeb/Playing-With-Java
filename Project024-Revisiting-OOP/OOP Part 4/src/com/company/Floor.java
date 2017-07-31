package com.company;

public class Floor {

    private String floorType;
    private String floorColor;
    private Dimensions dimensions;

    public Floor(String floorType, String floorColor, Dimensions dimensions) {
        this.floorType = floorType;
        this.floorColor = floorColor;
        this.dimensions = dimensions;
    }

    public String getFloorType() {
        return floorType;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
