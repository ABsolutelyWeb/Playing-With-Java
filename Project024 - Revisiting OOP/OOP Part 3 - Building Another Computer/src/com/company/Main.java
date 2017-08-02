package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("NZXT", "Phantom", "650W", dimensions);
        Monitor theMonitor = new Monitor("z18", "ASUS", 27, new Resolution(1920, 1080));
        Mobo theMobo = new Mobo("z98", "Acer", 4, 9,"sadf");

        Computer thePC = new Computer(theCase, theMobo, theMonitor);
        thePC.powerUp();
    }
}
