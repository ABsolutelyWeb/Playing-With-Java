package com.company;

public class LightSource {

    private String lightType;
    private String lightColor;

    public LightSource(String lightType, String lightColor) {
        this.lightType = lightType;
        this.lightColor = lightColor;
    }

    public void lightsOn() {
        System.out.println("Lights on.");
    }

    public String getLightType() {
        return lightType;
    }

    public String getLightColor() {
        return lightColor;
    }
}
