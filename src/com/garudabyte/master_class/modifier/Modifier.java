package com.garudabyte.master_class.modifier;

public class Modifier {
    public static int multiplier = 7;
    public static void main(String[] args) {

//        local variable
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

        //	    SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4;
//        System.out.println(Math.PI);
////        Math m = new Math();
//
//        int pw = 674312;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(523266);
//        password.letMeIn(9773);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(674312);

        System.out.println("Main method called");
        ModifierSIBTest test = new ModifierSIBTest();
        test.someMethod();
        System.out.println("Owner is " + ModifierSIBTest.owner);

//        anonymous class
        Pen pen = new Pen() {
            public void write() {
                System.out.println("Montex - write");
            }

            public void price() {
                System.out.println("Only I can decide");
            }
        };
        pen.write();
    }

    public static int multiply(int number) {
        return number * multiplier;
    }

    static class Pen {
        public void write() {
            System.out.println("Pen - write");
        }
    }
}

/*
Class
- custom data type
- special code block that contains method
Object
- instance of particular class

static field
- required static keyword when declare on the class
- value of the field is stored in special memory location and only in one place
- value is accessed by ClassName.fieldname example Integer.MAX_VALUE

static method
- require static keyword when declared on the class
- method is accessed by ClassName.methodname Integer.parseInt("123");

instance field
- omits 'static' keyword when declared on the class
- value of the field is not allocated any memory and has no value until the object is created
- value is accesed by ObjectVariable.fieldname "hello".toUpperCase();

instance method
- omits 'static' keyword when declared on the class
- method is accessed by ObjectVariable.methodName "hello".toUpperCase();

access modifier - member level
public
-> has the same meaning as at the top level. a public class (or field) and public method can be accessed from any other class anywhere, even in a different package

public class PublicClass{}

package-private
-> this also has the same meaning as it does at the top level
-> an object with no access modifier is visible to every class within the same package (but not to classes in external packages

class PackagePrivateClass{}

private
-> the object is only visible within the class it is declared. it is not visible anywhere else (including in subclasses of its class)

private class PrivateClass{}

protected
-> the object is visible anywhere in its own package (like package private) but also in subclasses even if they are in another package

protected class ProtectedClass{}

normal class fields require an instance of the class that don't actually exist until an instance has been created
main method is static, and it can be called with the class instance
so as a result, java can't allow a static method to access non-static field or method because they don't exist when the static methods called
we had to make the method static
*/