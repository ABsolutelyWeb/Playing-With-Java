package com.company;

public class HealthyBurger extends Burger {

    private String healthyAdd1;
    private double healthyAdd1Price;

    private String healthyAdd2;
    private double healthyAdd2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy","brown rye bread", meat, price);
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyAdd1 = name;
        this.healthyAdd1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyAdd2 = name;
        this.healthyAdd2Price = price;
    }

    @Override
    public double itemizeBurger() {
        double burgerPrice = super.itemizeBurger();
        if (this.healthyAdd1 != null) {
            burgerPrice += this.healthyAdd1Price;
            System.out.println("Added healthy extra: " + this.healthyAdd1 + " for an extra $" + this.healthyAdd1Price);
        }
        if (this.healthyAdd2 != null) {
            burgerPrice += this.healthyAdd2Price;
            System.out.println("Added healthy extra: " + this.healthyAdd2 + " for an extra $" + this.healthyAdd2Price);
        }

        return burgerPrice;
    }
}
