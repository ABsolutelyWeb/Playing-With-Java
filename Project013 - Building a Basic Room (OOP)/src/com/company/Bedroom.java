package com.company;

public class Bedroom {

    private Bed bed;
    private Desk desk;
    private Chair chair;
    private Lamp lamp;

    public Bedroom(Bed bed, Desk desk, Chair chair, Lamp lamp) {
        this.bed = bed;
        this.desk = desk;
        this.chair = chair;
        this.lamp = lamp;
    }

    public void getBedInfo() {
        bed.getBed1();
        printMessage();
    }

    private void printMessage() {
        System.out.println("Door opened. Welcome!");
    }

//    private Bed getBed() {
//        return bed;
//    }

    public Desk getDesk() {
        return desk;
    }

    public Chair getChair() {
        return chair;
    }

    public Lamp getLamp() {
        return lamp;
    }


}
