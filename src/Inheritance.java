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
*/
