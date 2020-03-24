package com.company.db;


import com.company.garage.Status;
import com.company.garage.Vehicle;

import java.lang.reflect.Array;
import java.util.*;

public class CarStorage {

    private int revenue;
    private HashMap<String, Vehicle> storage;
    private static CarStorage instance;


    private CarStorage() {
        this.revenue = 0;
        this.storage = new HashMap<String, Vehicle>();
    }

    public static CarStorage getInstance() {

        if (instance == null) {
            instance = new CarStorage();
        }

        return instance;
    }


    public Vehicle get(String id) {
        return this.storage.get(id);
    }

    public List<Vehicle> searchKeyword(String keyword) {
        List<Vehicle> arr = new ArrayList<>();

        for (Map.Entry<String, Vehicle> entry : this.storage.entrySet()) {
            Vehicle value = entry.getValue();
            if (value != null && value.containsKeyword(keyword)){
                arr.add(value);
            }
        }

        return arr;
    }

    public List<Vehicle> getByStatus(Status s) {
        String status = s.toString();
        List<Vehicle> arr = new ArrayList<>();

        for (Map.Entry<String, Vehicle> entry : this.storage.entrySet()) {
            Vehicle value = entry.getValue();
            if (value != null && value.getStatus().equals(status)){
                arr.add(value);
            }
        }

        return arr;
    }


    public void add(Vehicle v) {
        String plate = v.getId();

        if (plate == null || plate.isEmpty()) {
            return;
        }

        this.storage.put(plate, v);
    }

    public void release(Vehicle v) {
        String plate = v.getId();

        this.revenue += v.getRevenue();
        this.storage.remove(plate);
    }

    public int getRevenue() {
        return revenue;
    }

    public List<Vehicle> sortByComparator(Comparator<Vehicle> comparator)
    {
        List<Vehicle> list = new LinkedList<>(this.storage.values());
        list.sort(comparator);
        return list;
    }
}
