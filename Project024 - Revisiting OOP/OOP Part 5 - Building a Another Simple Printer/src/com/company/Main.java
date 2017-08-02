package com.company;

public class Main {

    public static void main(String[] args) {

        Printer hp = new Printer(1100, 100);
        System.out.println(hp.getTonerLevel());
        hp.printStuff("duplex", 119);
        hp.printStuff(120);
    }
}
