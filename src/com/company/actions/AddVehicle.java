package com.company.actions;

import com.company.garage.Motorcycle;
import com.company.garage.PrivateCar;
import com.company.garage.Truck;
import com.company.garage.Vehicle;

public class AddVehicle extends BaseAction implements Action {


    @Override
    public void perform() {

        System.out.println("adding vehicle, please enter details");
        System.out.println("Vehicle type: (1) Car (2) Truck (3) Motorcycle \n");

        int vehicleId = this.keyboard.nextInt();
        Vehicle vehicle = null;

        switch (vehicleId) {
            case 1:
                vehicle = new PrivateCar();
                break;
            case 2:
                vehicle = new Truck();
                break;
            case 3:
                vehicle = new Motorcycle();
                break;
            default:
                System.out.println("No such vehicle type");
                break;
        }

        if(vehicle == null) {
            return;
        }

        this.storage.add(vehicle);
    }
}
