package com.company;

public class Main {

    public static void main(String[] args) {

        Human ben = new Human("Ben", 42, 66, "blue");
        ben.speaking();
        ben.eating();
        ben.walking();
        ben.working();

        Human marge = new Human("Marge", 24, 60, "brown");
        marge.speaking();
        marge.eating();
        marge.walking();
        marge.working();


    }
}
