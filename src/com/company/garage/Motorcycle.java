package com.company.garage;

public class Motorcycle extends Vehicle {


    public Motorcycle() {
        super();

        System.out.println("Extra sit (true/false):");
        String seat = this.keyboard.next();

        this.features.put("Extra sit", seat);
    }

    @Override
    public int getRevenue() {
        return 1000;
    }
}
