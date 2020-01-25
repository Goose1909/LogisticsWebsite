package com.website.itemFactory;

public interface Item {
    Item createItem(String name, String description, double amount);
    void storeItem();
}
