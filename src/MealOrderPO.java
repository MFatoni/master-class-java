public class MealOrderPO {

    private BurgerPO burger;
    private ItemPO drink;
    private ItemPO side;

    public MealOrderPO() {
        this("regular", "coke", "fries");
    }

    public MealOrderPO(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurgerPO(burgerType, 8.5);
        } else {
            this.burger = new BurgerPO(burgerType, 4.0);
        }
        this.drink = new ItemPO("drink", drinkType, 1.00);
        this.side = new ItemPO("side", sideType, 1.50);
    }

    public double getTotalPrice() {

        if (burger instanceof DeluxeBurgerPO) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {

        burger.printItem();
        if (burger instanceof DeluxeBurgerPO) {
            ItemPO.printItem(drink.getName(), 0);
            ItemPO.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        ItemPO.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3,
                                  String extra4, String extra5) {
        if (burger instanceof DeluxeBurgerPO db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}
