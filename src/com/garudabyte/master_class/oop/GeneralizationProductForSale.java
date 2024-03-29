package com.garudabyte.master_class.oop;

public abstract class GeneralizationProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public GeneralizationProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty) {
        return qty * price;
    }

    public void printPricedItem(int qty) {

        System.out.printf("%2d qty at $%8.2f each,  %-15s %-35s %n",
                qty, price, type, description);
    }

    public abstract void showDetails();

}
