package com.company;

public class Room {

    private Floor roomFloor;
    private Bed roomBed;
    private Walls roomWalls;
    private Ceiling roomCeiling;
    private Door door;
    private LightSource roomLighting;

    public Room(Floor roomFloor, Bed roomBed, Walls roomWalls, Ceiling roomCeiling, Door door, LightSource roomLighting) {
        this.roomFloor = roomFloor;
        this.roomBed = roomBed;
        this.roomWalls = roomWalls;
        this.roomCeiling = roomCeiling;
        this.door = door;
        this.roomLighting = roomLighting;
    }
    public void getSwitch(String state) {
        if (state.toLowerCase() == "on") roomLighting.lightsOn();
        if (state.toLowerCase() == "off") System.out.println("Lights switched off.");
    }

    public Floor getRoomFloor() {
        return roomFloor;
    }

    public Bed getRoomBed() {
        return roomBed;
    }

    public Walls getRoomWalls() {
        return roomWalls;
    }

    public Ceiling getRoomCeiling() {
        return roomCeiling;
    }

    public Door getDoor() {
        return door;
    }

    public LightSource getRoomLighting() {
        return roomLighting;
    }
}
