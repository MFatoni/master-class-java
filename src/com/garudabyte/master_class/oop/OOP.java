package com.garudabyte.master_class.oop;

import com.garudabyte.master_class.class_object.ClassAccount;
import com.garudabyte.master_class.class_object.ClassCar;

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

        ClassCar firstCar = new ClassCar();
        ClassCar secondCar = firstCar;
        secondCar.setColor("Black");
        ClassCar thirdCar = new ClassCar();

        System.out.println(firstCar.getColor());
        System.out.println(secondCar.getColor());
        System.out.println(thirdCar.getColor());


//        com.garudabyte.master_class.classs.ClassAccount bobsAccount = new com.garudabyte.master_class.classs.ClassAccount();
//
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(087) 123-4567");
//
//        bobsAccount.withdrawFunds(100.0);
//        bobsAccount.depositFunds(250);
//        bobsAccount.withdrawFunds(50);
//        bobsAccount.withdrawFunds(200);
//        bobsAccount.depositFunds(100);
//        bobsAccount.withdrawFunds(45.55);
//        bobsAccount.withdrawFunds(54.46);
//        bobsAccount.withdrawFunds(54.45);

        ClassAccount bobsAccount = new ClassAccount(
                "12345",1000.00,"Bob Brown","email@email.com","08123456789"
        );
        System.out.println(bobsAccount.getBalance());

        ClassAccount timsAccount = new ClassAccount(
                "Bob Brown","email@email.com","08123456789"
        );
        System.out.println(timsAccount.getBalance());
    }
}

/*
com.garudabyte.master_class.oop.OOP (object oriented programming / class based programming) -> modeling real world object as software object, which contain both data and code
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

constructor
-> creation of an object (instance of a class),
-> it has the same name as the class itself, and it doesnt return any values, access modifier should be specify to controll who should be able to create new instances of the class
-> if there is no constructor declarations, default constructor is implicitly declared
-> no-args constructor, if there is no parameter set
-> constructor overloading is declaring multiple constructors, with different formal parameters
-> the number of parameters can be different between constructors, if have a same number, their type or order types must be differed
-> this() constructor chaining (when one constructor explicitly calls another overloaded constructor, must be the first executable statement

reference, object, instance, class
Class : Structure
Object : Physical Manifestation
Instance : each object created from class
Reference : Address of Object

Object
-> real world objects shares 2 main characteristics, state and behavior
-> Human have state (name, age) and behavior (running, sleeping)
-> Car have state (current speed, current gear) and behavior (applying brake, changing gear)
-> Software objects are conceptually similar to real-world objects: they too consist of state and related behavior.
-> An object stores its state in fields and exposes its behavior through methods.

Class
-> is a “template” / “blueprint” that is used to create objects
-> Basically, a class will consists of field, static field, method, static method and constructor
-> Field is used to hold the state of the class (eg: name of Student object)
-> Method is used to represent the behavior of the class (eg: how a Student object going to stand-up)
-> Constructor is used to create a new Instance of the Class.

Instance
-> An instance is a unique copy of a Class that representing an Object
-> When a new instance of a class is created, the JVM will allocate a room of memory for that class instance.

public class Person {
    private int id;
    private String name;
    private int age;

    public Person (int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public static void main(String[] args) {
        //case 1
        Person p1 = new Person(1, "Carlos", 20);
        Person p2 = new Person(1, "Carlos", 20);

        //case 2
        Person p3 = new Person(2, "John", 15);
        Person p4 = new Person(3, "Mary", 17);
    }
}
For case 1, there are two instances of the class Person, but both instances represent the same object.
For case 2, there are two instances of the class Person, but each instance represent a different object.
So class, object and instance are different things. Object and instance are not synonyms.

Class is Data Type,You use this type to create object.
Instance is Logical but object is Physical means occupies some memory.
We can create an instance for abstract class as well as for interface, but we cannot create an
object for those.
Object is instance of class and instance means representative of class i.e object.
Instance refers to Reference of an object.
Object is actually pointing to memory address of that instance.
You can’t pass instance over the layers but you can pass the object over the layers
You can’t store an instance but you can store an object
A single object can have more than one instance.
Instance will have the both class definition and the object definition where as in object it will have only the object definition.

Syntax of Object:
 Classname var=new Classname();
But for instance creation it returns only a pointer refering to an object, syntax is :
 Classname varname;

class -> kerangka/blueprint hal didunia nyata
object -> representasi hal didunia nyata
instance -> realisasi unik dari class yang merepresentasikan object

in java, there is no way to access an object directly , everything is done using that reference

reference vs object (3 instance, 2 references)
new House("red"); house object get created in memory
House myHouse = new House("beige); house object get created in memory, and it's location (reference) is assigned to redHouse
House redHouse = new House("red"); different object altogether, from the red house that created on line one, this statement is creating another house object in memory, which has no relationship to the one we created on the first line

static variable
-> every instance of the class shares the same static variable, so if changes are made to that variable, all other instances of that class will be affected,
-> it is considered best practice to use the Class name, and not a reference variable to access a static variable,
-> an instance isnt required to exist, to access the value of a static variable
-> storing counters, generating unique ids, storing constant value like pi, creating, controlling to a shared resources
class Dog{
    private static String name;

    public Dog(String name){
        Dog.name = name;
    }

    public void printName(){
        System.out.println("name = "+name);
    }
}
public class Main{
    public static void main(String[] args){
        Dog rex = new Dog("rex"); // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName(); //prints fluffy
        fluffy.printName(); //prints fluffy
    }
}

instance variable
-> instance variable has its own
-> every instance can have a different value
-> instance variable represent the state, of a specific instance of a class
class Dog{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("name = "+name);
    }
}
public class Main{
    public static void main(String[] args){
        Dog rex = new Dog("rex"); // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)
        rex.printName(); //prints rex
        fluffy.printName(); //prints fluffy
    }
}

static methods -> declared using a static modifier, static methods cant access instance methods and instant variables directly, they're usually used for operations that dont require any data from an instance of the class (from 'this'), inside static method cant use this keyword, whenever you see a method that doesnt use instance variables, that method should probably be declared as static method, for example main is a static method, and it's called by the JVM when it starts the java app
class Calculator{
    public statuc void printSum(int a, int b){
        System.out.println((a+b));
    }
}
public class Main {
    public static void main(String[] args){
        Calculator.printSum(5,10);
        printHello(); // shorter from of Main.printHello();
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}

statics methods are called as ClassName.methodName(); or methodName(); only if in the same class

instance methods -> belong to an instance of a class, we have to instantiate the class first, usually by using the new keyword, instance methods can access instance methods and instance variables directly, instance methods can also access static methods and static variables directly
class Dog{
    public void bark(){
        System.out.println("woof");
    }
    public class Main{
        public static void main(String[] args){
            Dog rex = new Dog();
            rex.bark();
        }
    }
}

POJO (plain old java object)
-> a class that generally only has instance fields
-> it's used house data, pass data, between functional classes,it usually has few, if any methods other than getter and setter
-> many database fw use pojo's to read data from, or to write data to databases files or stream
JavaBean / DTO (Data Transfer Object)
-> pojo with extra rules applied
-> a pojo is sometimes called an entity, because it mirrors database entities
-> it's a description of an object, that can be modeled as just data
*/