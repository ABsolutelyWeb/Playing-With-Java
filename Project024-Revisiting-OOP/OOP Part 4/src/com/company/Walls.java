package com.company;

public class Walls {

    private String wallColor;
    private Dimensions wallDimensions;
    private String wallTexture;

    public Walls(String wallColor, Dimensions wallDimensions, String wallTexture) {
        this.wallColor = wallColor;
        this.wallDimensions = wallDimensions;
        this.wallTexture = wallTexture;
    }

    public String getWallColor() {
        return wallColor;
    }

    public Dimensions getWallDimensions() {
        return wallDimensions;
    }

    public String getWallTexture() {
        return wallTexture;
    }
}
