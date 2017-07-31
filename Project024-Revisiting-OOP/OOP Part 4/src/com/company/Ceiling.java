package com.company;

import java.awt.*;

public class Ceiling {

    private Dimensions ceilDimensions;
    private String ceilColor;
    private String ceilTexture;

    public Ceiling(Dimensions ceilDimensions, String ceilColor, String ceilTexture) {
        this.ceilDimensions = ceilDimensions;
        this.ceilColor = ceilColor;
        this.ceilTexture = ceilTexture;
    }

    public Dimensions getCeilDimensions() {
        return ceilDimensions;
    }

    public String getCeilColor() {
        return ceilColor;
    }

    public String getCeilTexture() {
        return ceilTexture;
    }
}
