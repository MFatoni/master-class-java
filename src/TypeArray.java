import java.util.Arrays;
import java.util.Random;

public class TypeArray {
    public static void main(String[] args) {
        int[] newArray = {1,2,3,4,5}; // [I@8efb846 -> I mean primitive integer array, followed by hexadecimal representation of the hash code, it doesnt override object string method
        System.out.println(newArray);
        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("world");
        objectArray[2] = newArray;

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        String[] sArray = {"able","jane"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"able")>=0){
            System.out.println("exist");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays equal");
        }

//        share same reference
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("hello");

        System.out.println("_".repeat(20));
        printText("hello", "world", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray1 = {"first","second","third"};
        System.out.println(String.join(",", sArray1));

        int[][] array1 = {{1,2},{3,4}};
        int[][] array2 = {{1,2},{3,4,5}};
        int[][] array3 = new int[3][];

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

//        int[][] myDoubleArray;
//        int[] myDoubleArray[];

        array2[1] = new int[] {10,20,30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a","b","c"};
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for(Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i=0; i<len;i++){
            newInt[i]=random.nextInt(100);
        }
        return newInt;
    }

    private static void modifyArray(int[] array){
        array[1]=2;
    }

//    private static void printText(String[] textList){
//
//    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}

/*
array
-> mutable but we could not resize it
-> a special class in java, it inherits from java.lang.Object
-> a data structure that allows us to store multiple values, of the same type, in a single variable
-> the default values of numeric array elements are set to zero
-> arrays are zero indexed

array variable declaration
int[] integerArray;
String[] nameList;
String courseList[];

instantiating an array
int[] integerArray = new int[10];

array initializer
int[] firstFivePositives = new int[]{1,2,3,4,5};

anonymous array
int[] firstFivePositive = {1,2,3,4,5};
String[] names = {"test"}
int[] newArray;
newArray = new int[] {5,4,3,2,1}

java.util.arrays

java's array type is very basic, it comes with little built-in functionality
it has a single property or field, named length
and it inherits java.util.Object functionality
java provides a helper class named java.util.arrays, providing common functionality, you'd want for many array operations
these are static methods on Arrays, so are class methods, not instance methods

array searching
-> interval and sequential

interval searching using binary search
-> need to be sorted
-> there are duplicate values in the array, there's no guarantee which one it'll match on
-> element must be comparable. trying to compare instances of different types, may lead to errors and invalid results

-> when we assign an object to a variable, the variable becomes a reference to that object
-> this is true of arrays, but the array has yet another level of indirection, if it's an array of object
-> this means every array element is also a reference

varargs (...)
-> there can be only one variable argument in a method
-> the variable argument must be the last argument
*/