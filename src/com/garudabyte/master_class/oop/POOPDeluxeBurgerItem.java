package com.garudabyte.master_class.oop;

public class POOPDeluxeBurgerItem extends POOPBurgerItem {

    POOPItem deluxe1;
    POOPItem deluxe2;

    public POOPDeluxeBurgerItem(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new POOPItem("TOPPING", extra4, 0);
        deluxe2 = new POOPItem("TOPPING", extra5, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
