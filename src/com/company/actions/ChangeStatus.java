package com.company.actions;

import com.company.db.CarStorage;
import com.company.garage.Status;
import com.company.garage.Vehicle;

import java.util.Scanner;

public class ChangeStatus extends BaseAction implements Action {



    @Override
    public void perform() {

        System.out.println("License plate:");
        String plate = this.keyboard.next();
        Vehicle v = this.storage.get(plate);

        if(v == null) {
            System.out.println("No such vehicle in garage");
            return;
        }

        System.out.println("Select the new status: (1) In Process (2) Fixed (3) Released");
        int status = keyboard.nextInt();

        Status s = Status.values()[status];
        v.changeStatus(s);

        if(s == Status.RELEASED) {
            this.storage.release(v);
        }
    }
}
