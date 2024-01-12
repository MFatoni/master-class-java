package com.garudabyte.master_class.oop;

public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationPlayer player = new EncapsulationPlayer();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = "+ player.healthRemaining());

        EncapsulationEnchancedPlayer tim = new EncapsulationEnchancedPlayer("Tim");
        System.out.println("Initial health = "+ tim.healthRemaining());

    }
}

/*
encapsulation
-> to make the interface simpler, we may want to hide unnecessary details
-> to protect the integrity of data on an object, we may hide or restrict access to some of the data and operations
-> to decouple the published interface from the internal details of the class, we may hide actual names and types of class members
-> allowing direct access to data on an object, can potentially bypass checks, and additional processing, your class has in place to manage the data
-> it encourages an interdependency, or coupling, between the calling code and the class
-> allowing direct access to fields, means calling code would need to change, when you edit any of the fields
-> omitting a constructor, that would accept initialization data, may mean the calling code is responsible for setting up this data, on the new object
-> changing a field name, broke the calling code
-> calling code had to take on the responsibility, for properly initializing a new player

encapsulation principles
-> create constructors for object initialization, which enforces that only object with valid data will get created
-> use the private access modifier for your fields
-> use setter and getter method sparingly, and only as needed
-> use access modifiers that aren't private only for the methods that the calling code needs to use
*/