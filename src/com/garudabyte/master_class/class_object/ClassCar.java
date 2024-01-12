package com.garudabyte.master_class.class_object;

public class ClassCar {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if(make==null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(
                doors + " door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }
}

/*
default value
boolean -> false, byte short int long chart -> 0, double float -> 0.0, other type -> null
null -> no reference to object

getter and setter -> to control, protect, access to private fields
getter -> retrieve value of a private field, and returns it
setter -> set value of private field

non static field -> method non static

this
-> refer to instance that was created when the object instantiated
-> can be used to describe itself (access field on class)
-> keyword this is optional (required if a similar local variable name exist)

Car car; -> compiler error
Car car = null; runtime error, null pointer


 */