package com.company;

public class Door {

    private String doorMaterial;
    private String doorKnobType;
    private String doorColor;

    public Door(String doorMaterial, String doorKnobType, String doorColor) {
        this.doorMaterial = doorMaterial;
        this.doorKnobType = doorKnobType;
        this.doorColor = doorColor;
    }

    public String getDoorMaterial() {
        return doorMaterial;
    }

    public String getDoorKnobType() {
        return doorKnobType;
    }

    public String getDoorColor() {
        return doorColor;
    }
}
