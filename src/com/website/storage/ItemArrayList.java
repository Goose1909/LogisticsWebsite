package com.website.storage;

import com.website.itemFactory.Item;

import java.util.ArrayList;

public class ItemArrayList {
    private ArrayList<Item> itemArrayList;

    public ItemArrayList() {
        this.itemArrayList = null;
    }

    public ItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = new ArrayList<Item>();
    }

    public void storeItemInItemArrayList(Item item) {
        itemArrayList.add(item);
        System.out.println(item.getClass() + " added to ArrayList...");
    }
}
