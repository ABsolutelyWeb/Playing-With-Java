package com.company;

public class Earth {
    public static void main(String[] args) {
        Human human1 = new Human("Carly", 15, 65, "brown");
        Human human2 = new Human("Tom", 56, 71, "black");
        Human human3 = new Human("Beany", 23, 60, "blue");

        human1.speak();
        System.out.println(" ");
        human2.speak();
        System.out.println(" ");
        human3.speak();

        // inheritance

    }
}
