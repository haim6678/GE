package com.company.actions;

import com.company.db.CarStorage;

import java.util.Scanner;

public class BaseAction {


    protected Scanner keyboard;
    protected CarStorage storage;


    public BaseAction() {
        this.keyboard = new Scanner(System.in);
        this.storage = CarStorage.getInstance();
    }

}
