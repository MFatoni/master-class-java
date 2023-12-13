public class Inheritance {
    public static void main(String[] args) {
        InheritanceAnimal animal = new InheritanceAnimal(
                "Generic Animal",
                "Huge",
                400
        );
        doAnimalStuff(animal,"slow");

        InheritanceDog dog = new InheritanceDog();
        doAnimalStuff(dog, "fast");

        InheritanceDog yorkie = new InheritanceDog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");

        InheritanceDog retriever = new InheritanceDog("Labrador Retriever",65,"Floppy","Swimmer");
        doAnimalStuff(retriever, "slow");

        InheritanceDog wolf = new InheritanceDog("Wolf", 40);
        doAnimalStuff(wolf,"slow");

        InheritanceFish goldie = new InheritanceFish("Goldfish", 0.25,2,3 );
        doAnimalStuff(goldie, "fast");

        InheritanceEmployee tim = new InheritanceEmployee("Tim","11/11/1985","01/01/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());

        InheritanceEmployee joe = new InheritanceEmployee("Joe","11/11/1985","01/01/2020");
        System.out.println(joe);

        InheritanceSalariedEmployee arthur = new InheritanceSalariedEmployee("Arthur","11/11/1985","01/01/2020",35000);
        System.out.println(arthur);
        System.out.println("Arthur's paycheck = $"+arthur.collectPay());

        arthur.retired();
        System.out.println("Joe's pesion check = $"+arthur.collectPay());

        InheritanceHourlyEmployee mary = new InheritanceHourlyEmployee("Mary","05/05/1970","03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $"+mary.collectPay());
        System.out.println("Mary's holiday pay = $"+mary.getDoublePay());
    }

    public static void doAnimalStuff(InheritanceAnimal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}

/*
inheritance -> a way to organize classes into a parent--child hierarchy, which lets the child inherit, fields and methods from its parent
extends -> specifies the superclass (parent class) of the clas we're declaring
a class can specify one and only one, class in its extends clause
all subclasses can execute methods, even though the code is declared on the parent class
the code doesn't have to be duplicated in each subclass
we can use code from parent or we can change that code for the subclass
all object is inheritated from java.lang.Object

overriding
-> create method on subclass, which has the same signature as a method on a super class
-> you override a parent class method, when you want the child class to show different behavior for that method
-> it can implement completely different behavior, overriding the behavior of the parent
-> it can simply call the parent class's method, which is somewhat redundant to do
-> or the method can call the parent class's method, and include other code to run, so it can extend the functionality for dog, for that bahavior

super
-> is used to access or call the parent class member (variables and methods)
-> commonly used with method overriding, when we call a method with the same name, from the parent class
-> java put default super(), if we dont add it, and it's always a call to the no argument constructor
-> must be the first

class SuperClass{
    public void printMethod(){
        System.out.println("Printed in SuperClass.");
    }
}

class SubClass extends SuperClass{
    @Override
    public void printMethod(){
        super.printMethod();
        System.out.println("Printed in Subclass.");
    }
}

class MainClass{
    public static void main(String[] args){
        SubClass s = new SubClass();
        s.printMethod();
    }
}

class Shape{
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;
    public Rectangle(int x, int y){
        this(x,y,0,0);
    }
    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width=width;
        this.height=height;
    }
}

this
-> is used to call the current class members
-> required when we have a parameter with the same name
-> this() call a constructor, from another overloaded constructor in the same class
-> this() can only be used in a constructor, and it must be the first statement in a constructor
-> it's used with constructor chaining, in other words when one constructor calls another constructor and it helps to reduce duplicated code

public class House{
    private String color;
    public House(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}

class Rectangle{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(){
        this(0,0);
    }

    public Rectangle(int width, int height){
        this(0,0,width,height);
    }

    public Rectangle(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
}

we can use either of them anywhere in a class, except for static element

method overloading (compile time polymorphism)
-> same name, different parameneter
-> return type my or may not be different, and that allows us to reuse tht same method name
-> we can overload static, or instance methods
-> overloading usually happens within single class, but method can also be overloaded by subclasses
-> may throw different exceptions

method overriding (runtime polymorphism, dynamic method dispatch)
-> same signature (same name, same arguments)
-> method is going to be called is decided at runtime by the jvm
-> put @Override
-> it cant have more resrictive access previledges
-> if the parents method is protected, then private in the childs overriden method is not allowed
-> a subclass can use super.methodName() to call the superclass version of an overriden method
-> must have the same return type or covariant return type
-> must not throw a new or breader checked exception

covariant return type
-> return type may vary during overriding
-> before java 5 it wasnt allowed to override any method if return type is changed in child class
-> but now its possible only if return type is subclass type

public Object parentClass(){
    return null;
}

public String childClass() extends parentClass(){
    return "covariant type";
}

*/
