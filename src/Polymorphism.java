public class Polymorphism {
    public static void main(String[] args) {
        PolymorphismMovie theMovie = new PolymorphismMovie("Star Wars");
        theMovie.watchMovie();
        PolymorphismMovie theMovieAdventure = new Adventure("Star Wars");
        theMovieAdventure.watchMovie();
        PolymorphismMovie theMovieComedy  = PolymorphismMovie.getMovie("Comedy","Comedy");
        theMovieComedy.watchMovie();

        Adventure theMovieCasting = (Adventure) PolymorphismMovie.getMovie("A", "Jaws");
        theMovieCasting.watchMovie();

        Object comedy  = PolymorphismMovie.getMovie("C","Airplane");
//        PolymorphismMovie comedyMovie = (PolymorphismMovie) comedy;
//        comedyMovie.watchMovie();

        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = PolymorphismMovie.getMovie("C","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = PolymorphismMovie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof Comedy syfy){
//            auto ast
            syfy.watchComedy();
        }
    }
}

/*
polymorphism
-> lets us write code to call a method, but at runtime, this method;s behavior can be different, for different object
-> this means the behavior that occurs, while the program is executing, depends on the runtime type of the object
-> and the runtime type, might be different from the declared type in the code
-> the declared type has to have some kind of relationship to the runtime type, and inheritance is one way to establish this relationship

factory method

-> it's the ability to execute different behaviour, for different types, which are determined at runtime
-> polymorphism enables to write generic code, based on the base class, or a parent class
-> and this code, in the main method, is extendable, meaning it doesn't have to change as subclasses become available

var
-> a special contextual keyword in java, that's lets our code take advantage of local variable type inference
-> telling java to figure out the compile-time type

local variable type inference (lvti)
-> local variable type inference was introduced in java 10
-> one of the benefits is to help with the readability of the code, and to reduce boilerplate code

-> it cant be used in field declarations on a class
-> it cant be used in method signatures, either as a parameter type or a return type
-> it cant be used without an assignment, because the type cant be inferred in that case
-> it cant be assigned a null literal, because the type cant be inferred in that case

run time vs compile time typing
compile type = declared type
this type is declared either as variable reference or a method return type or a method parameter
in case of lvti. we dont declare a type for the compiled reference type, it get inferred, but byte code is the same, as if we had declared it
in many cases, the compile time type, is the declared type to the left of the assignment operator
what is returned on the right side of the assignment operator, from whatever expression or method is executed, sometimes can only be determined at runtime, when the code is executing conditionally, through the statements in the code
we can assign a runtime instance, to a different compile time type, only if centain rules are followed
we can assign an instance to a variable of the same type, or a parent type, or a parent's parent type, including java.lang.Object, the ultimate base class
the reason why the runtime types different than compile time types is because of polymorphism

instanceof operator
the instanceof operator, lets you test the type of an object or instance
the reference variable you are testing, is the left operand
the type you are testing for, is the right operand
unknownObject instanceof Adventure
it's important to see that Adventure is not quotes, meaning we're testing the type name, but the actual type
this operator returns true, if the unknownObject is an instance of Adventure
*/