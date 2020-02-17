package com.website.controller;

import com.website.itemFactory.Item;
import com.website.itemFactory.ItemFactory;
import com.website.storage.ItemArrayList;

import java.util.Scanner;

public class Controller {
    private Scanner scan;
    private ItemFactory itemFactory;

    public Controller() {
        scan = new Scanner(System.in);
        itemFactory = new ItemFactory();
    }

    public void startProgramLoop() {
        boolean continueCondition = true;
        while(continueCondition == true) {
            System.out.print("Welcome to the Logistics Program (1 for non-perishables, 2 for perishables): ");
            int choice = scan.nextInt();
            try {
                if (choice == 1) {
                    handleNonPerishableItem();
                    continueCondition = checkIfUserWantsToContinue();
                } else if (choice == 2) {
                    handlePerishableItem();
                    continueCondition = checkIfUserWantsToContinue();
                } else {
                    System.out.print("Invalid input. Please put 1 or 2.");
                    continueCondition = true;
                }
             }catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(continueCondition == false) {
                    System.out.println("Thanks for using the Logistics Program.");
                }
            }
        }
    }

    public void handleNonPerishableItem() {
        System.out.println("You've chosen non-perishable item...");
        var item = itemFactory.getItem("non-perishable");
        getStandardItemInfoAndCreateItem(item);
    }

    public void handlePerishableItem() {
        System.out.println("You've chosen perishable item...");
        var item = itemFactory.getItem("perishable");
        getStandardItemInfoAndCreateItem(item);
    }

    public boolean checkIfUserWantsToContinue() {
        boolean continueCondition = false;
        while(true) {
            System.out.print("Continue? (Y/N): ");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("Y")) {
               continueCondition = true;
               break;
            } else if (choice.equalsIgnoreCase("N")) {
                continueCondition = false;
                break;
            } else {
                System.out.print("Invalid input.");
               continueCondition = true;
            }
        }
        return continueCondition;
    }

    public void getStandardItemInfoAndCreateItem(Item item) {
        System.out.print("Enter item name: ");
        String name = scan.next();
        System.out.print("Enter description: ");
        String description = scan.next();
        System.out.print("Enter amount (EX: 12.5 or 10.0): ");
        double amount = scan.nextDouble();
        item.createItem(name,description,amount);
    }
}
