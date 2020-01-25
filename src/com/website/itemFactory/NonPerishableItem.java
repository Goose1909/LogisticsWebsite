package com.website.itemFactory;

public class NonPerishableItem implements Item {
    private String nonPerishableItemName;
    private String nonPerishableItemDescription;
    private double nonPerishableItemAmount;

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
        Item item = new NonPerishableItem(nonPerishableItemName, nonPerishableItemDescription, nonPerishableItemAmount);
    }

    @Override
    public void storeItem() {
        //Will add to DB when implemented
    }
}
