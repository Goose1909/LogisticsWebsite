package com.website.itemFactory;

import com.website.storage.ItemArrayList;

public class NonPerishableItem implements Item {
    private String nonPerishableItemName;
    private String nonPerishableItemDescription;
    private double nonPerishableItemAmount;
    private ItemArrayList itemArrayList;

    public NonPerishableItem() {
        this.nonPerishableItemName = "";
        this.nonPerishableItemDescription = "";
        this.nonPerishableItemAmount = 0.0;
    }

    public NonPerishableItem(String nonPerishableItemName, String nonPerishableItemDescription,
                             double nonPerishableItemAmount) {
        this.nonPerishableItemName = nonPerishableItemName;
        this.nonPerishableItemDescription = nonPerishableItemDescription;
        this.nonPerishableItemAmount = nonPerishableItemAmount;
    }

    public double getNonPerishableItemAmount() {
        return nonPerishableItemAmount;
    }

    public String getNonPerishableItemDescription() {
        return nonPerishableItemDescription;
    }

    public String getNonPerishableItemName() {
        return nonPerishableItemName;
    }

    public void setNonPerishableItemAmount(double nonPerishableItemAmount) {
        this.nonPerishableItemAmount = nonPerishableItemAmount;
    }

    public void setNonPerishableItemDescription(String nonPerishableItemDescription) {
        this.nonPerishableItemDescription = nonPerishableItemDescription;
    }

    public void setNonPerishableItemName(String nonPerishableItemName) {
        this.nonPerishableItemName = nonPerishableItemName;
    }

    @Override
    public void createItem(String nonPerishableItemName, String nonPerishableItemDescription,
                           double nonPerishableItemAmount) {
        Item item = null;
        try {
            item = new NonPerishableItem(nonPerishableItemName, nonPerishableItemDescription, nonPerishableItemAmount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(!item.equals(null)) {
                storeItem(item);
            }
        }
    }
    public void storeItem(Item item) {
        itemArrayList.storeItemInItemArrayList(item);
    }
}
