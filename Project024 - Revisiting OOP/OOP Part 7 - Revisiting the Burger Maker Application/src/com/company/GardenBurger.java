package com.company;

public class GardenBurger extends BasicBurger {

    private String gardenAdd1;
    private double gardenAdd1Price;

    private String gardenAdd2;
    private double gardenAdd2Price;

    public GardenBurger(String meatTpe, double cost) {
        super("Garden Burger", "Brown Rye Roll", meatTpe, cost);
    }



    public void add1ToGarden(String additionName, double price) {
        this.gardenAdd1 = additionName;
        this.gardenAdd1Price = price;
    }

    public void add2ToGarden(String additionName, double price) {
        this.gardenAdd2 = additionName;
        this.gardenAdd2Price = price;
    }

    @Override
    public double totalBurgerPrice() {
        double burgerPrice = super.totalBurgerPrice();
        if (this.gardenAdd1 != null) {
            burgerPrice += this.gardenAdd1Price;
            System.out.println("Added healthy extra: " + this.gardenAdd1 + " for an extra $" + this.gardenAdd1Price);
        }

        if (this.gardenAdd2 != null) {
            burgerPrice += this.gardenAdd2Price;
            System.out.println("Added healthy extra: " + this.gardenAdd2 + " for an extra $" + this.gardenAdd2Price);
        }
        return burgerPrice;
    }
}
