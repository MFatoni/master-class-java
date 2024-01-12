package com.garudabyte.master_class.oop;

public class POOPMealOrder {

    private POOPBurgerItem burger;
    private POOPItem drink;
    private POOPItem side;

    public POOPMealOrder() {
        this("regular", "coke", "fries");
    }

    public POOPMealOrder(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new POOPDeluxeBurgerItem(burgerType, 8.5);
        } else {
            this.burger = new POOPBurgerItem(burgerType, 4.0);
        }
        this.drink = new POOPItem("drink", drinkType, 1.00);
        this.side = new POOPItem("side", sideType, 1.50);
    }

    public double getTotalPrice() {

        if (burger instanceof POOPDeluxeBurgerItem) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {

        burger.printItem();
        if (burger instanceof POOPDeluxeBurgerItem) {
            POOPItem.printItem(drink.getName(), 0);
            POOPItem.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        POOPItem.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof POOPDeluxeBurgerItem db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}
