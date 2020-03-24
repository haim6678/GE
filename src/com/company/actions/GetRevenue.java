package com.company.actions;

public class GetRevenue extends BaseAction implements Action {

    @Override
    public void perform() {

        int revenue = this.storage.getRevenue();

        System.out.println("Total revenue: " + revenue);
    }
}
