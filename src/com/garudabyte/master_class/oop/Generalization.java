package com.garudabyte.master_class.oop;

import java.util.ArrayList;

public class Generalization {
    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100);

        GeneralizationDog dog = new GeneralizationDog("Wolf", "big", 100 );
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<GeneralizationAnimal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new GeneralizationDog("German Shepard", "big", 150));
        animals.add(new GeneralizationFish("Goldfish", "small", 1));
        animals.add(new GeneralizationFish("Barracuda", "big", 75));
        animals.add(new GeneralizationDog("Pug", "small", 20));

        animals.add(new GeneralizationHorse("Clydesdale", "large", 1000));

        for (GeneralizationAnimal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof GeneralizationMammal currentMammal) {
                currentMammal.shedHair();
            }
        }

    }

    private static void doAnimalStuff(GeneralizationAnimal animal) {

        animal.makeNoise();
        animal.move("slow");
    }
}

/*
part of generalizing is using abstraction
we can generalize a set of characteristics and behaviour into an abstract type
abstraction simplifies the view of a set of items trait and behavior, so we can talk about then as a group, as well ass generalize their functionality

octopus, dog, penguin -> animal
animal doesn't really exist, except as a way to describe a set of more specific things
if we cant draw it on a piece of paper, it's probably abstract

java supports abstraction in several different ways
-> java allows us to create a class hierarchy, where the top of the hierarchy, the base class is usually an abstract concept, whether it's an abstract class or not
-> java let's us create abstract classes
-> java gives us a way to create interfaces

abstract method
-> has a method signature, and a return type, but doesn't have a method body
-> we say an abstract method is unimplemented
-> it's purpose is to describe behaviour, which any object of that type will always have
-> we can think abstract method as contract, contract promises that all subtypes will provide the promised functionality, with the agreed upon name and arguments

concrete method
-> has a method body, usually with at least one statement
-> it has operational code, that gets executed, under the right conditions
-> concrete method is said to implement an abstract method, if it overrides one
-> abstract classes and interfaces, can have a mix of abstract and concrete methods

method modifiers
abstract -> method body is always omitted, abstract method can only be declared on an abstract class or an interface
static -> class method/instance method, it's called directly on the class instance
final -> a method that is final cannot be overriden by subclasses
default -> only applicable to an interface
native -> method with no body, but it's very different from the abstract modifier, the method body will be implemented in platform-dependent code
-> typically written in another programming language such as c
synchronized -> this modifier manages how multiple threads will access the code in this method

abstract class
-> the abstract class is declared with the abstract modifier
-> an abstract class is a class that's incomplete, we cant create an instance of an abstract class
-> an abstract class can still have a constructor, which will be called by its subclasses, during their construction
-> a class that extends an abstract class can also be abstract itself

abstract class Mammal extends Animal {}

-> an abstract class can extend a concrete class

abstract class BestOfBreed extends Dog {}

abstract method
-> declared with the modifier abstract

abstract class Animal{
    public abstract void move();
}

-> the subtype will implement this method with this signature
-> this is also true for a concrete class, and a concrete method that's overriden

interface
-> similar to an abstract class, although it isn't a class at all
-> special type, that's more like a contract between the class and client code that the compiler enforces
-> by declaring it's using an interface, our class must implement all the abstract method, on the interface
-> an interface is usually named, according to the set of behaviors it describes
-> many interfaces will end in able, like comparable and iterable, again meaning something is capable or ca do, a given set of behaviors

public interface com.garudabyte.master_class.oop.FlightEnabled{}

public class Bird implements FligtEnabled{}

-> we can use com.garudabyte.master_class.oop.FlightEnabled as the reference type, and assign it an instance of bird

com.garudabyte.master_class.oop.FlightEnabled flier = new Bird();

-> class can only extend a single class, which is why java is called single inheritance
-> class can implement many interfaces

oublic class Bird extends Animal implements com.garudabyte.master_class.oop.FlightEnabled, com.garudabyte.master_class.oop.Trackable{}

-> we don't have to declare the interface type abstract, because this modifier is implicitly declared for all interfaces
-> likewise, we dont have to declare any method abstract
-> in fact, any method declared without a body, is really implicitly declared both public and abstract

wrong
public abstract void fly()
abstract void fly()

right
void fly()

-> if we omit an access modifier on a class member, it's implicitly package private
-> if we omit an access modifier on an interface member, it's implicitly public
-> changing the access modifier of a method to protected, on an interface, is a compiler error, whether the method is concrete or abstract
-> only a concrete method can have private access
-> interface lets us treat an instance of a single class as many different types

final modifier
-> final method means it can't be overriden by a subclass
-> final field means an object's field can't be reassigned or given a different value after its inicialization
-> final static field is a class field that can't be reassigned, or given a different value, after the class's initialization process
-> final class can't be overridden, meaning no class can use it, in the extends clause
-> final variable, in a block of code, means that once it's assigned a value, any remaining code in the block can't change it
-> final method parameter means, we can't assign a different value to that parameter in the code block

constant
-> constant in java is a variable that can't be changed
-> constant variable is a final variable of primitive type, or type String, that is initialized with a constant expression
-> constant in java, are usually named with all uppercase letters, and with underscores between words
-> static constant mean we access it via the type name

-> these all mean the same thing on an interface

double MILES_TO_KM = 1.61;
final double MILES_TO_KM = 1.61;
public final double MILES_TO_KM = 1.61;
public static final double MILES_TO_KM = 1.61;

-> interface never gets instantiated, and won't have a subclass that gets instantiated either
-> there's no such thing as instance fields on an interface
-> interface can be extended
-> interface can use the extends expression with multiple interface
-> interface doesn't implement another interface

interface com.garudabyte.master_class.oop.OrbitEarth extends com.garudabyte.master_class.oop.FlightEnabled, com.garudabyte.master_class.oop.Trackable{}

-> both interface and abstract classes are abstracted reference types
-> reference types can be used in code, as variable type, method parameters, and return types, list types, and so on
-> when we use an abstracted reference type, this is referred to as coding to an interface
-> this mean our code doesn't use specific types, but more generalized ones, usually an interface type
-> this technique is preferred, because it allows many runtime instance of various classes, to be processed uniformly, by the same code
-> it also allows for substitutions of some other class or object, that still implements the same interface, without forcing a major refactor of your code
-> coding to an interface scales well, to support new subtypes, and it helps when refactoring code
-> the downside though, is that alterations to the interface may wreak havoc, on the client code
-> imagine we have 50 classes using our interface, ad we want to add an extra absctract method, to support new functionality
-> as soon as we add new abstract method, all 50 classes won't compile

-> jdk 8 introduced the default method and public static methods, and jdk 9 introduced private method, both static and non-static
-> all of these new method types (on the interface are concrete methods)

interface extension method
-> extension method is identified by the modifier default, so it's more commonly known as the default method
-> this method is a concrete method, meaning it has code block and we can add statement
-> it has to have method body, even just an empty set of curly braces
-> it's a lot like method on a superclass, because we can override it
-> adding a default method doesn't break any classes currently implementing the interface

overriding a default method
-> we can choose not to override it at all
-> we can override the method and write code for it, so that the interface method isn't executed
-> we can write our own code, and invoke the method on the interface, as part of our implementation

abstract class
-> abstract classes are very similar to interface, we can't instantiate either of them. both types may contain a mix of methods declared with or without a method block
-> with abstract classes, we can declare fields that aren't static and final, instance fields in other words
-> with abstract classes, we can use any of the four access modifier for its concrete methods
-> we can also use all but the private access modifier, for it abstract methods
-> abstract class extends only one parent class, but it can implement multiple interfaces
-> when an abstract class is subclassed, the subclass usually provides implementatios for all of the abstract methods in its parent class
-> if it doesn't then the subclass must also be declared abstract

when use it
-> we want to share code, among several closely related classes (Animal for example with fields, name, age)
-> we expect classes that extend our abstract class, to have many common methods or fields, or require access modifiers other than public
-> we want to declare non-static or non-final fields, so this enables us to define methods, that can access and modify the state of an object
-> we have a requirement for our base class, to provide a default implementation of certain method, but other methods should be open to being overriden by child classes
-> an abstract class provides a common definition, as a base class, that multiple, derived classes can share

interface
-> an interface is just the declaration of methods, which we want some classes to have, it's not the implementation
-> in an interface we define what kind of operation an object can perform. these operations are defined by the classes that implement the interface
-> interfaces form a contract between the class, and the outside world, and this contract is enforced build time, by the java compiler
-> we can't instantiate interfaces, but they may contain a mix of methods declared with, or without an implementation
-> all methods on interfaces, declared without a method body, are automatically public and abstract
-> an interface can extend another interface
-> the interface decouples the what from the how, and is used to make different types behave in similar ways
-> since java 8 interface can now contain default methods, so in other words methods with implementation
-> the keyword default is used mostly for backward compatibility. public static method were also introduced in java 8
-> since java 9, an interface can also contain private methods, commonly used when default, methods share common code

when use it
-> we expect that unrelated classes will implement our interface. for example, two of java's own interface comparable and cloneable, can be implemented by many unrelated classes
-> we want to specify the behaviour of a particular data type, but you're not concerned about who implements its behavior
-> we want separate behaviour

-> interface like List and Queue, and their implementation ArrayList and LinkedList. these are part of what java call it's collection framework
-> another sample of interface are lambda expression, jdbc

abstract vs interface
an instance can be created from it : -
has a constructor : a
implemented as part of the class hierarchy, use inheritance : a
record and enums can extend or implement : i
inherit from java.lang.object : a
can have both abstract methods and concrete methods : a i
abstract method must include abstract modifier : a
support default modifier for it's methods : i
can have instance field (non-static instance fields) : a
can have static fields :a i
*/