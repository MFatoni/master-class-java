package com.garudabyte.master_class.oop;

public class Composition {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","240");
        Monitor theMonitor = new Monitor("27inch", "Acer",27,"2540 x 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");
        CompositionPersonalComputer thePC = new CompositionPersonalComputer("2208","Dell", theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10,10,"black");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

        CompositionSmartKitchen kitchen = new CompositionSmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
/*
inheritance defines an is a relationship
composition defines a has a relationship

Product
^ inherit (is a)
PersonalComputer
^ is made up of (has a)
-> com.garudabyte.master_class.oop.Monitor
-> com.garudabyte.master_class.oop.Motherboard
-> com.garudabyte.master_class.oop.ComputerCase

com.garudabyte.master_class.oop.Monitor
size:int
resolution:String
drawPixelAt(int x, int y, String color)

com.garudabyte.master_class.oop.Motherboard
ramSlots:int
cardSlots:int
bios:String
loadProgram(String programName)

com.garudabyte.master_class.oop.ComputerCase
powerSupply:String
pressPowerButton()

inheritance is a way to reuse functionality and attributes
composition is a way to make the combination of classes, act like a single coherent object

the reasons composition is preferred over inheritance:
-> composition is more flexible, you can add parts in or remove them, and these changes are less likely to have downstream effect
-> composition provides functional reuse outside of the class hierarchy,
meaning classes can share attributes & behaviour, by having similar components
instead of inheriting functionality from a parent or base class
-> java's inheritance breaks encapsulation, because parents state or behavior

inheritance is less flexible
-> adding a class to, or removing a class from, a class hierarchy, may impact all subclasses from that point
-> in addition, a new subclass may not need all the functionality or attributes of its parent class

-> product
model:String
manufacturer: String
^inherits (is a)
-> motherboard
ramSlots:int
cardSlots:intW
bios:String
dimensions:Dimensions
loadProgram(String programName)
^ has a
-> Dimensions
width:int
height:int
depth:int
*/