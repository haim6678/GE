package com.company;

import com.company.actions.Action;
import com.company.actions.ActionManager;

import java.util.Scanner;

public class Menu {

    private String menue;
    private Scanner keyboard;
    private ActionManager actionManager;

    public Menu() {
        this.actionManager = ActionManager.getInstance();
        this.keyboard = new Scanner(System.in);
        this.menue = "\nPlease select one of the following options: \n" +
                "1. Add new vehicle \n" +
                "2. Change vehicle status \n" +
                "3. Get vehicle details \n" +
                "4. Get vehicles list by status \n" +
                "5. Get vehicles list by keyword \n" +
                "6. Get vehicles list by manufacturing year \n" +
                "7. Get total revenue of released vehicles \n" +
                "8. Exit \n";
    }

    public void run() {
        int actionId;
        Action action;

        do {
            System.out.println(this.menue);

            actionId = this.keyboard.nextInt();
            action = this.actionManager.getAction(actionId);

            if(action == null) {
                continue;
            }

            action.perform();
        } while (actionId != 8);

        System.out.println("Existing ...");
    }
}
