package com.company;

public class Matress {

    private String matressType;
    private Dimensions matressDimension;
    private String mattressColor;

    public Matress(String matressType, Dimensions matressDimension, String mattressColor) {
        this.matressType = matressType;
        this.matressDimension = matressDimension;
        this.mattressColor = mattressColor;
    }

    public String getMatressType() {
        return matressType;
    }

    public Dimensions getMatressDimension() {
        return matressDimension;
    }

    public String getMattressColor() {
        return mattressColor;
    }
}
