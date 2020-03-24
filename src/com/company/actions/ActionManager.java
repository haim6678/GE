package com.company.actions;

import java.util.HashMap;

public class ActionManager {


    private static ActionManager instance;
    private HashMap<Integer, Action> map;


    private ActionManager() {
        this.map = new HashMap<Integer, Action>();
        this.map.put(1, new AddVehicle());
        this.map.put(2, new ChangeStatus());
        this.map.put(3, new VehicleDetails());
        this.map.put(4, new GetByStatus());
        this.map.put(5, new SearchKeywords());
        this.map.put(6, new GetSortedByYear());
        this.map.put(7, new GetRevenue());
    }

    public static ActionManager getInstance() {

        if (instance == null) {

            instance = new ActionManager();
        }

        return instance;
    }


    public Action getAction(int action) {
        return this.map.get(action);
    }
}
