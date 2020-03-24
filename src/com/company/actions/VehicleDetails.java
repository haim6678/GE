package com.company.actions;

import com.company.garage.Vehicle;

public class VehicleDetails extends BaseAction implements Action  {

    @Override
    public void perform() {

        System.out.println("License plate:");
        String plate = this.keyboard.next();
        Vehicle v = this.storage.get(plate);

        if(v == null) {
            System.out.println("No such vehicle in garage");
            return;
        }

        System.out.println(v.toString());
    }
}
