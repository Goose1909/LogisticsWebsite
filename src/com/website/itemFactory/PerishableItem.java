package com.website.itemFactory;

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

    public PerishableItem() {
        this.perishableItemName = "";
        this.perishableItemExpirationDate = null;
        this.perishableItemDescription = "";
        this.perishableItemAmount = 0.0;
        this.scan = new Scanner(System.in);
        this.dateFormat = new SimpleDateFormat("MM-dd-yyyy");
    }

    public PerishableItem(String perishableItemName, Date perishableItemExpirationDate, String perishableItemDescription, double perishableItemAmount) {
        this.perishableItemName = perishableItemName;
        this.perishableItemExpirationDate = perishableItemExpirationDate;
        this.perishableItemDescription = perishableItemDescription;
        this.perishableItemAmount = perishableItemAmount;
        this.scan = new Scanner(System.in);
        this.dateFormat = new SimpleDateFormat("MM-dd-yyyy");
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
        if(true) {
            try {
                Item item = new PerishableItem();
                System.out.print("Enter Expiration Date (EX: 01/15/2020): ");
                Date date = dateFormat.parse(scan.next());
                item = new PerishableItem(perishableItemName, date, perishableItemDescription, perishableItemAmount);
            } catch (ParseException e) {
                System.out.println(e.getStackTrace());
            } finally {
                scan.close();
            }
        }
    }

    @Override
    public void storeItem() {
        //Will add to DB when implemented.
    }
}
