package com.garudabyte.master_class.oop;

public class InheritanceDog extends InheritanceAnimal {
    private String earShape;
    private String tailShape;
    public InheritanceDog(String type, double weight){
        this(type,weight, "Perky","Curled");
    }
    public InheritanceDog(){
        super("Mutt", "Big", 50);
    }

    public InheritanceDog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : "large", weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "com.garudabyte.master_class.oop.InheritanceDog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (type == "Wolf"){
            System.out.println("Ow wooo");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk, run and wag their tail");
        if(speed=="slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof");
    }
    private void run(){
        System.out.println("Dog running");
    }

    private void walk(){
        System.out.println("Dog walking");
    }

    private void wagTail(){
        System.out.println("Tail wagging");
    }
}
/*
java will implicitly declare constructor, if we dont explicitly declare one
so the child must mirrors the implicit constructor java creates for us
super
-> a way to call the constructor on the parent class
-> it has to be the first statement of the constructor
-> because of that rule, this and super can never be called from the same constructor
-> if we dont make a call to super(), then java makes it for you using super's default constructor
-> if the super class doesnt constructor, than we must explicitly call super() in all of our constructor, passing the right arguments to that constructor
*/