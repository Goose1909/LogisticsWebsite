package com.website.controller;

import com.website.itemFactory.ItemFactory;

import java.util.Scanner;

public class Controller {
    private Scanner scan;
    private ItemFactory item;

    public Controller() {
        scan = new Scanner(System.in);
        item = new ItemFactory();
    }

    public void startProgramLoop() {
        boolean continueCondition = true;
        while(continueCondition) {
            System.out.print("Welcome to the Logistics Program (1 for non-perishables, 2 for perishables):");
            int choice = scan.nextInt();
            if(choice == 1) {
                handleNonPerishableItem();
                continueCondition = checkIfUserWantsToContinue();
            } else if (choice == 2) {
                handlePerishableItem();
                continueCondition = checkIfUserWantsToContinue();
            } else {
                System.out.print("Invalid input. Please put 1 or 2.");
                continueCondition = true;
            }
        }
    }

    public void handleNonPerishableItem() {
        item.getItem("perishable");
    }

    public void handlePerishableItem() {
        item.getItem("non-perishable");
    }

    public boolean checkIfUserWantsToContinue() {
        boolean continueCondition;
        while(true) {
            System.out.print("Continue? (Y/N): ");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("Y")) {
                return true;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.print("Invalid input.");
                return true;
            }
        }
        return false;
    }
}
