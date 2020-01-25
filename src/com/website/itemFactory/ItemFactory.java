package com.website.itemFactory;

public class ItemFactory {

    public Item getItem(String itemType) {
        if (itemType == null) {
            System.out.println("Null item detected.");
            return null;
        } else if (itemType.equalsIgnoreCase("perishable")) {
            return new PerishableItem();
        } else if (itemType.equalsIgnoreCase("non-perishable") ||
                   itemType.equalsIgnoreCase("nonperishable")) {
            return new NonPerishableItem();
        } else {
            System.out.println("Invalid input.");
            return null;
        }
    }
}
