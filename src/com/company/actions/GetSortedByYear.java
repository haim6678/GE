package com.company.actions;

import com.company.garage.Vehicle;

import java.util.Comparator;
import java.util.List;

public class GetSortedByYear extends BaseAction implements Action {
    @Override
    public void perform() {


        // i did it like this so if i will be required to add new sorting type it will be easy

        Comparator<Vehicle> comparator = null;
        SortType sortBy = SortType.values()[0];

        switch (sortBy) {
            case YEAR:
                    comparator = (v1, v2) -> v1.getYear().compareTo(v2.getYear());
                break;
            default:
                break;
        }

        List<Vehicle> list = this.storage.sortByComparator(comparator);

        for (Vehicle v : list) {
            System.out.println(v.toString());
        }
    }
}
