package com.company;

public class Counter {

    private String str;
    private int count;

    public Counter(String str) {
        this.str = str;
        this.count = 0;
    }

    public void increment() {
        System.out.println("Incrementing by 1...");
        this.count++;
    }

    public int getCurrentValue() {
        System.out.println("Current value of " + this.str + " is " + this.count);
        return this.count;
    }

    public String getStr() {
        return str + ": " + count;
    }
}
