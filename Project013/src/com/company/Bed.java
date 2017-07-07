package com.company;

public class Bed {
    private String sheets;
    private String blanket;
    private String mattress;
    private String pillow;
    private String frame;

    public Bed(String sheets, String blanket, String mattress, String pillow, String frame) {
        this.sheets = sheets;
        this.blanket = blanket;
        this.mattress = mattress;
        this.pillow = pillow;
        this.frame = frame;
    }

    public void getBed1() {
        System.out.println("Sheets: " + sheets);
        System.out.println("Blanket: " + blanket);
        System.out.println("Mattress: " + mattress);
        System.out.println("Pillow: " + pillow);
        System.out.println("Frame: " + frame);
    }
}
