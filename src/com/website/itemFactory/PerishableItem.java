package com.website.itemFactory;

import com.website.storage.ItemArrayList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PerishableItem implements Item{
    private String perishableItemName;
    private Date perishableItemExpirationDate;
    private String perishableItemDescription;
    private double perishableItemAmount;
    private Scanner scan;
    private SimpleDateFormat dateFormat;
    private ItemArrayList itemArrayList;

    public PerishableItem() {
        this.perishableItemName = "";
        this.perishableItemExpirationDate = null;
        this.perishableItemDescription = "";
        this.perishableItemAmount = 0.0;
    }

    public PerishableItem(String perishableItemName, Date perishableItemExpirationDate, String perishableItemDescription, double perishableItemAmount) {
        this.perishableItemName = perishableItemName;
        this.perishableItemExpirationDate = perishableItemExpirationDate;
        this.perishableItemDescription = perishableItemDescription;
        this.perishableItemAmount = perishableItemAmount;
    }

    public void setPerishableItemName(String perishableItemName) {
        this.perishableItemName = perishableItemName;
    }

    public String getPerishableItemName() {
        return this.perishableItemName;
    }

    public void setPerishableItemExpirationDate(Date perishableItemExpirationDate) {
        this.perishableItemExpirationDate = perishableItemExpirationDate;
    }

    public Date getPerishableItemExpirationDate() {
        return this.perishableItemExpirationDate;
    }

    public void setPerishableItemDescription(String perishableItemDescription) {
        this.perishableItemDescription = perishableItemDescription;
    }

    public String getPerishableItemDescription() {
        return this.perishableItemDescription;
    }

    public void setPerishableItemAmount(double perishableItemAmount) {
        this.perishableItemAmount = perishableItemAmount;
    }

    public double getPerishableItemAmount() {
        return this.perishableItemAmount;
    }

    @Override
    public void createItem(String perishableItemName, String perishableItemDescription, double perishableItemAmount) {
        Item item = null;
        try {
            this.scan = new Scanner(System.in);
            this.dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            System.out.print("Enter Expiration Date (EX: 01-15-2020): ");
            Date date = dateFormat.parse(scan.next());
            String junk = scan.nextLine();
            item = new PerishableItem(perishableItemName, date, perishableItemDescription, perishableItemAmount);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            if (!item.equals(null)) {
                storeItem(item);
            }
        }
    }

    public void storeItem(Item item) {
        itemArrayList.storeItemInItemArrayList(item);
    }
}
