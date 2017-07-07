package com.company;


class Car {
    private int wheels;
    private int cylinders;
    private boolean engine;
    private String  name;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
        this.name = name;
    }

    public String startEngine() {
        return "Car engine is on...";
    }

    public String accelerate() {
        return  "Car accelerating...";
    }

    public String brake() {
        return "Car braking...";
    }
}



class BMW extends Car {
    public BMW() {
        super(4, "BMW");
    }
    @Override
    public String startEngine() {
        return "BMW engine is on...";
    }
    @Override
    public String accelerate() {
        return  "BMW accelerating...";
    }
    @Override
    public String brake() {
        return "BMW braking...";
    }
}



class Ferrari extends Car {
    public Ferrari() {
        super(6, "Ferrari");
    }
    @Override
    public String startEngine() {
        return "Ferrari engine is on...";
    }
    @Override
    public String accelerate() {
        return  "Ferrari accelerating...";
    }
    @Override
    public String brake() {
        return "Ferrari braking...";
    }
}



class Lambo extends Car {
    public Lambo() {
        super(8, "Lambo");
    }
    @Override
    public String startEngine() {
        return "Lambo engine is on...";
    }
    @Override
    public String accelerate() {
        return  "Lambo accelerating...";
    }
    @Override
    public String brake() {
        return "Lambo braking...";
    }
}



public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " " + car.startEngine());
            System.out.println("Car #:" + i + " "  + car.brake());
            System.out.println("Car #:" + i + " "  + car.accelerate());
            System.out.println(" ");
        }
    }

    public static Car randomCar() {
        int randomInt = (int) (Math.random() * 3) + 1;
        System.out.println("Random integer was " + randomInt);
        switch (randomInt) {
            case 1:
                return new BMW();
            case 2:
                return new Ferrari();
            case 3:
                return new Lambo();
            default:
                return null;
        }
    }
}
