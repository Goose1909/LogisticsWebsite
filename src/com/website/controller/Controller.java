package com.website.controller;

import com.website.itemFactory.Item;
import com.website.itemFactory.ItemFactory;

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
        while(continueCondition) {
            System.out.print("Welcome to the Logistics Program (1 for non-perishables, 2 for perishables): ");
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

    public Item handleNonPerishableItem() {
        System.out.println("You've chosen non-perishable item...");
        var item = itemFactory.getItem("non-perishable");
        getStandardItemInfoAndCreateItem(item);
        return item;
    }

    public Item handlePerishableItem() {
        System.out.println("You've chosen perishable item...");
        var item = itemFactory.getItem("perishable");
        getStandardItemInfoAndCreateItem(item);
        return item;
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

    public void getStandardItemInfoAndCreateItem(Item item) {
        System.out.print("Enter item name: ");
        String name = scan.next();
        System.out.print("Enter description: ");
        String description = scan.next();
        System.out.print("Enter amount (EX: 12.5 or 10.0):");
        double amount = scan.nextDouble();
        item.createItem(name,description,amount);
    }
}
