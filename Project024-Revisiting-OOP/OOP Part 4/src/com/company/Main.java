package com.company;

public class Main {

    public static void main(String[] args) {

        Room myRoom = new Room(
                        new Floor("wooden", "oak", new Dimensions(100, 75)),
                        new Bed(new BedFrame("metal", "gun metal"), new Matress("memory foam", new Dimensions(10, 30), "tan")),
                        new Walls("white", new Dimensions(100, 75), "rough"),
                        new Ceiling(new Dimensions(100, 75), "white", "rough"),
                        new Door("oakwood", "metal", "oak"),
                        new LightSource("lamp", "yellow tinted")
                    );

        myRoom.getSwitch("on");
        myRoom.getSwitch("off");

    }
}