public class OOP {
    public static void main(String[] args) {
        ClassCar car = new ClassCar();
        car.setMake("Porche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("Black");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        car.describeCar();

        ClassAccount bobsAccount = new ClassAccount();

        bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000.00);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("myemail@bob.com");
        bobsAccount.setCustomerPhone("(087) 123-4567");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
        bobsAccount.withdrawFunds(54.45);
    }
}

/*
OOP (object oriented programming / class based programming) -> modeling real world object as software object, which contain both data and code
class based programming starts with classes, which become the blueprint for objects

object components -> state, behaviour
state
computer object -> the amount of ram, the operating system, the hdd size, the size of the monitor
ant object -> the age, the number of legs, the conscious state, whether the ant is sleeping or is awake
behaviour
computer object -> booting up, shutting down, beeping, drawing something on the screen

a software object store its state in fields, which can also be called variable, or attributes

the class describes the data (fields) and the behaviour that are relevant to the real world object we want to describe
these are called class members
class -> instance members -> fields & methods
class -> static members -> fields & methods
class member can be a field, or method or some other type of dependent element
if a field is static, there is only one copy in memory, and this value is associated with the class, or template, itself
if a field is not static, it's called an instance field, and each object may have a different value stored for this field
a static method cant be dependent on any one object's state, so it can't reference any instance members
in other words, any method that operates on instance fields, need to be non-static

classes can be organized into logical groupings, which are called packages
you declare a package name in the class using the package statement
if doesnt declare a package, the class implicitly belongs to the default package

access modifiers
a class is said to be a top-level class, if it defined in the source code file, and not enclosed in the code block of another class, type, or method
a top-level class has only two valid access modifier options: public or none

public -> public means any other class in any package can access this class
none -> when the modifier is omitted, this has special meaning, called package access, meaning the class is accessible only to classes in the same package

public -> any other class in any package can access this class
protected -> allow classes in the same package, and any subclasses in other packagesm to have access to the member, when the modifier is omitted, this has special meaning, called package access, meaning the member is accessible only to classes in the same package
private -> no other class can access this member

all class should be private unless it should be public (encapsulation concept)
encapsulation in oop usually has 2 meanings
-> bundling of behavior and attributes on a single object
-> the practice of hiding fields, and some methods, from public access

non static -> need to initiate the class first
*/