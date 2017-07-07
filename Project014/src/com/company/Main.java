package com.company;

public class Main {

    public static void main(String[] args) {
        Printer prntr = new Printer(25, true);
        System.out.println("Page count: " + prntr.getNumPages());

        int pagesPrinted = prntr.print(5);
        System.out.println("Pages printed were " + pagesPrinted + " new total print count is " + prntr.getNumPages());
    }
}
