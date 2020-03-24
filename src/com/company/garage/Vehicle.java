package com.company.garage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Vehicle {

    protected Scanner keyboard;
    protected HashMap<String, String> features;

    protected Vehicle() {
        this.keyboard = new Scanner(System.in);
        this.features = new HashMap<>();


        System.out.println("License plate:");
        String plate = keyboard.next();
        this.features.put("License plate", plate);


        System.out.println("Year of manufacturing:");
        String year = keyboard.next();
        this.features.put("Year of manufacturing", year);


        System.out.println("Problem description:");
        String desc = keyboard.next();
        this.features.put("Problem description", desc);

        this.features.put("Status", Status.NEW.toString());

    }

    public Boolean containsKeyword(String keyword) {
        String desc = this.features.get("Problem description");
        if (desc == null || desc.isEmpty()) {
            return false;
        }
        return desc.toLowerCase().contains(keyword.toLowerCase());
    }

    public String getYear() {
        return this.features.get("Year of manufacturing");
    }

    public String getStatus() {
        return this.features.get("Status");
    }

    public String getId() {
        return this.features.get("License plate");
    }

    public abstract int getRevenue();

    public void changeStatus(Status status) {
        this.features.put("Status", status.toString());
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Map.Entry<String, String> entry : this.features.entrySet()) {
            s.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        return s.toString();
    }
}
