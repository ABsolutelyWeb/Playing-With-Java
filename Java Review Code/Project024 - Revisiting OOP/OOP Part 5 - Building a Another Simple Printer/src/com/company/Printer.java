package com.company;

public class Printer {

    private int tonerLevel;
    private int printerPaper;
    private int pageCount;

    public Printer() {
        this(100, 100);
        System.out.println("Empty Printer constructor called.");
    }

    public Printer(int tonerLevel, int printerPaper) {

        // If someone enters in a toner level that is above 100 or
        // below or equal to 10, make the level 100 by default.
        if (tonerLevel > 100 || tonerLevel <= 10) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }

        this.printerPaper = printerPaper;
        this.pageCount = 0;
    }

    // Every page printed takes away 1% of the toner
    // level. Nothing can be printed unless toner
    // level is replenished.
    public void printStuff(int numPages) {
        for (int i = 1; i <= numPages; i++) {
            this.tonerLevel -= 1;
            System.out.println("Printed page " + i + " ---- Toner level at " + this.tonerLevel);
            if (this.tonerLevel == 0) {
                System.out.println();
                System.out.println("Toner ran out. Replenishing. Standby...");
                replenishToner();
                System.out.println("New cartridge inserted. Resuming...");
                System.out.println();
            }
        }
    }

    public void printStuff(String mode, int numPages) {
        if (mode.toLowerCase() == "duplex" || mode.toLowerCase() == "d") numPages /= 2;
        if (numPages % 2 != 0) numPages += 1;
        printStuff(numPages);
    }



    private void replenishToner() {
        this.tonerLevel = 100;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrinterPaper() {
        return printerPaper;
    }

    public int getPageCount() {
        return pageCount;
    }
}
