package com.company;

public class Printer {
    private int tonerLevel;
    private int numPages;
    private boolean isTwoSided;

    public Printer(int tonerLevel, boolean isTwoSided) {
        if (tonerLevel <= 100 && tonerLevel > -1) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.isTwoSided = isTwoSided;
        this.numPages = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) return -1;
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if(this.isTwoSided) {
            pagesToPrint /= 2;
            System.out.println("Printing in double side mode.");
        }
        this.numPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumPages() {
        return numPages;
    }
}
