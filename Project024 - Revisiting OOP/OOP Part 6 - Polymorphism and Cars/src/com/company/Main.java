package com.company;

class Car {

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car (String name, int cylinders) {

        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEnghine() {
        return "Car engine starting";
    }

    public String accelerate() {
        return "Car accelerating.";
    }

    public String brake() {
        return "Car braking.";
    }
}


class Nissan extends Car {

    public Nissan() {
        super("Nissan", 4);
    }

    @Override
    public String startEnghine() {
        return "Nissan engine starting";
    }

    @Override
    public String accelerate() {
        return "Nissan accelerating.";
    }

    @Override
    public String brake() {
        return "Nissan braking.";
    }

}


class Honda extends Car {

    public Honda() {
        super("Honda", 6);
    }

    @Override
    public String startEnghine() {
        return "Honda engine starting";
    }

    @Override
    public String accelerate() {
        return "Honda accelerating.";
    }

    @Override
    public String brake() {
        return "Honda braking.";
    }

}


class Fiat extends Car {

    public Fiat() {
        super("Fiat", 4);
    }

    @Override
    public String startEnghine() {
        return getClass().getSimpleName() + "Fiat engine starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerating.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " braking.";
    }

}




public class Main {

    public static void main(String[] args) {

        //test
        for (int i = 1; i < 6; i++) {
            Car car = manyCars();
            System.out.println("Car #" + i + " is: " + car.getName());
            System.out.println(car.accelerate() + "\n");
        }
    }

    public static Car manyCars() {
        int generateRandNum = (int) (Math.random()*3)+1;
        switch (generateRandNum) {
            case 1:
                return new Nissan();

            case 2:
                return new Fiat();

            case 3:
                return new Honda();

            default:
                return new Car("Unknown", 0);
        }
    }

    public static int randInt() {
        int generateRandNum = (int) (Math.random()*3)+1;
        return generateRandNum;
    }
}
