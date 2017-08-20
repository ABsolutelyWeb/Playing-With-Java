package com.company;

public class Zoo {
    public static void main(String[] args) {
//        Animal is now abstract class so it can no longer be instantiated.
//        Animal rhino = new Animal(5, 2000, "male", "Horn", "rhino");
//        Animal cockatoo = new Animal(50, 1, "male", "Too", "cockatoo");
//        Animal zebra = new Animal(15, 400, "female", "Stripes", "zebra");

        Fish shark = new Fish(10, 400, "female", "White", "great white");
        Animal whale = new WhaleShark(40, 3000, "female", "Whaley", "blue whale");
        Animal hammerhead = new Hammerhead(13, 200, "male", "Sharky", "hammerhead");

        System.out.println(" ");
        shark.about();
        shark.swimming();

//        System.out.println(" ");
//        rhino.about();
//        rhino.running();
//
//        System.out.println(" ");
//        cockatoo.about();
//        cockatoo.fly();
//
//        System.out.println(" ");
//        zebra.about();
//        zebra.eat();

        System.out.println(" ");
        whale.about();
        sprintingBehavior(whale);

        System.out.println(" ");
        hammerhead.about();
//        hammerhead.leaping();
        sprintingBehavior(hammerhead);



    }

    public static void sprintingBehavior(Animal animal) {
        animal.sprinting();
    }
}
