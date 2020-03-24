package com.company.actions;

import com.company.garage.Vehicle;

import java.util.List;

public class SearchKeywords extends BaseAction implements Action {

    @Override
    public void perform() {
        System.out.println("Enter the keyword to search:");
        String keyword = this.keyboard.next();

        List<Vehicle> list = this.storage.searchKeyword(keyword);

        if (list.size() == 0) {
            System.out.println("No vehicles with this keyword");
            return;
        }

        for (Vehicle v : list) {
            System.out.println(v.toString());
        }
    }
}
