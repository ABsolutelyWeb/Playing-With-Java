package com.company;

public class BasicBurger {

    private String name;
    private String rollType;
    private String meatTpe;
    private double cost;

    private String firstAddition;
    private double firstAdditionPrice;

    private String secondAddition;
    private double secondAdditionPrice;

    private String thirdAddition;
    private double thirdAdditionPrice;

    private String fourthAddition;
    private double fourthAdditionPrice;



    public BasicBurger(String name, String rollType, String meatTpe, double cost) {
        this.name = name;
        this.rollType = rollType;
        this.meatTpe = meatTpe;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void add1ToBurger(String additionName, double price) {
        this.firstAddition = additionName;
        this.firstAdditionPrice = price;
    }

    public void add2ToBurger(String additionName, double price) {
        this.secondAddition = additionName;
        this.secondAdditionPrice = price;
    }

    public void add3ToBurger(String additionName, double price) {
        this.thirdAddition = additionName;
        this.thirdAdditionPrice = price;
    }

    public void add4ToBurger(String additionName, double price) {
        this.fourthAddition = additionName;
        this.fourthAdditionPrice = price;
    }

    public double totalBurgerPrice() {
        double totalPrice = this.cost;
        if (this.firstAddition != null) {
            totalPrice += this.firstAdditionPrice;
            System.out.println("Added " + this.firstAddition + " for an extra $" + this.firstAdditionPrice);
        }

        if (this.secondAddition != null) {
            totalPrice += this.secondAdditionPrice;
            System.out.println("Added " + this.secondAddition + " for an extra $" + this.secondAdditionPrice);
        }

        if (this.thirdAddition != null) {
            totalPrice += this.thirdAdditionPrice;
            System.out.println("Added " + this.thirdAddition + " for an extra $" + this.thirdAdditionPrice);
        }

        if (this.fourthAddition != null) {
            totalPrice += this.fourthAdditionPrice;
            System.out.println("Added " + this.fourthAddition + " for an extra $" + this.fourthAdditionPrice);
        }

        return totalPrice;
    }


}
