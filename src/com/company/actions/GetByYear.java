package com.company.actions;

import com.company.garage.Status;
import com.company.garage.Vehicle;

import java.util.List;

public class GetByYear extends BaseAction implements Action {
    @Override
    public void perform() {
        System.out.println("Select the status: (0) New (1) In Process (2) Fixed");
        int status = keyboard.nextInt();

        Status s = Status.values()[status];
        List<Vehicle> list = this.storage.getByStatus(s);

        if (list.size() == 0) {
            System.out.println("No vehicles in this year");
            return;
        }

        for (Vehicle v : list) {
            System.out.println(v.toString());
        }
    }
}
