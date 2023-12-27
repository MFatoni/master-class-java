import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Boxing  {
    public static void main(String[] args) {
//        arraylist and linkedlist dont support primitive data types
//        LinkedList<int> myIntegers = new LinkedList<>();

        Integer boxedInt = Integer.valueOf(15);      // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15);  // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();        // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);

    }

    private static ArrayList<Integer> getList(Integer... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {

        return i;
    }

    private static Integer returnAnInteger(int i) {

        return i;
    }

    private static Double getDoubleObject() {

        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {

        return 100.0;
    }
}

/*
Why does Java have primitive data types?
-> Some object-oriented languages, don't support any primitive data types at all, meaning everything is an object
-> But most of the more popular object oriented languages of the day, support both primitive types and objects, as does lava.
-> Primitive types generally represent the way data is stored on an operating system.
-> Primitives have some advantages over objects, especially as the magnitude, or number of elements increase.
-> Objects take up additional memory, and may require a bit more processing power.
-> We know we can create objects, with primitive data types as field types, for example, and we can also return primitive types from methods

java give us wrapper classes for each primitive type
-> we can go from a primitive to a wrapper, which called boxing java.lang.Integer -> int, java.lang.Double -> double
-> we can go from a wrapper to a primitive, which called unboxing

boxing
-> each wrapper has a static overloaded factory method, valueOf(), which takes a primitive and returns an instance of the wrapper class

Integer boxedInt = Integer.valueOf(15);

autoboxing

Integer boxedInt = 15;

unboxing

-> every wrapper class supports a method to return the primitive value it contains

int unboxedInt = boxedInteger.intValue();

autounboxing

int unboxedInt = boxedInteger;
*/