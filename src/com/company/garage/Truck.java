package com.company.garage;

public class Truck extends Vehicle {


    public Truck() {
        super();

        System.out.println("Weight limit:");
        String limit = this.keyboard.next();

        this.features.put("Weight limit", limit);
    }

    @Override
    public int getRevenue() {
        return 5000;
    }
}
