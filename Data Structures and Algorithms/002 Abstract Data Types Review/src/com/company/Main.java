package com.company;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter("first1");
        count.increment();
        count.increment();
        count.increment();
        count.getCurrentValue();
        System.out.println(count.getStr());

        count.increment();
        count.getCurrentValue();
        System.out.println(count.getStr());
    }

}
