package com.website.itemFactory;

public interface Item {
    void createItem(String name, String description, double amount);
    void storeItem(Item item);
}
