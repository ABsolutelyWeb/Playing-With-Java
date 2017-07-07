package com.company;

public class Main {

    public static void main(String[] args) {
	    Lamp lamp1 = new Lamp("hourglass", "coil", 100);
	    Chair chair1 = new Chair(4, "mahogany", "brown");
	    Desk desk1 = new Desk(4, "oak");
	    Bed bed1 = new Bed("satin", "wool", "memory foam", "puffy", "steel");

	    Bedroom bedroom1 = new Bedroom(bed1, desk1, chair1, lamp1);
		bedroom1.getBedInfo();
    }
}
