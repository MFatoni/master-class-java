package com.garudabyte.master_class.type;

public class TypeString {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n"+
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point
                """;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d",age);
        //%d is format specifier

        int yearOfBirth = 2023-age;
        System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
/*
\t insert a tab
\n insert a new line
\" insert double quote
\\ insert a backslash

format specifiers
%[argument_index$][flags][width][.precision]conversion

Conversion	Argument Category	Description
'b', 'B'	general	            If the argument arg is null, then the result is "false". If arg is a boolean or Boolean, then the result is the string returned by String.valueOf(arg). Otherwise, the result is "true".
'h', 'H'	general	            If the argument arg is null, then the result is "null". Otherwise, the result is obtained by invoking Integer.toHexString(arg.hashCode()).
's', 'S'	general	            If the argument arg is null, then the result is "null". If arg implements Formattable, then arg.formatTo is invoked. Otherwise, the result is obtained by invoking arg.toString().
'c', 'C'	character	        The result is a Unicode character
'd'	        integral	        The result is formatted as a decimal integer
'o'	        integral	        The result is formatted as an octal integer
'x', 'X'	integral	        The result is formatted as a hexadecimal integer
'e', 'E'	floating point	    The result is formatted as a decimal number in computerized scientific notation
'f'	        floating point	    The result is formatted as a decimal number
'g', 'G'	floating point	    The result is formatted using computerized scientific notation or decimal format, depending on the precision and the value after rounding.
'a', 'A'	floating point	    The result is formatted as a hexadecimal floating-point number with a significand and an exponent. This conversion is not supported for the BigDecimal type despite the latter's being in the floating point argument category.
't', 'T'	date/time	        Prefix for date and time conversion characters. See Date/Time Conversions.
'%'	        percent	            The result is a literal '%' ('\u0025')
'n'	        line separator	    The result is the platform-specific line separator

string inspection methods
length -> return the number of characters in the string
charAt -> return the character at the index thats passed
indexOf , lastIndexOf -> return an integer, representing the index in the sequence where the string or character passed, can be located in the string
isEmpty -> return true if length is zero
isBlank -> return true if length is zero or the string only contains whitespace characters

string comparison methods
contentEquals
-> return a boolean if the string's value is equal to the value of the argument passed
-> this method allows for arguments other than string, for any type that is a character sequence
equals -> return a boolean if the string's value is equal to the argument passed
equalsIgnoreCase -> return a boolean if the string's value is equal (ignore case), to the value of the argument passed
contains -> return a boolean if the string contains the argument passed
endWith, startsWith -> these return a boolean, and are much like the contains method, but more specific to the placement of the argument in the String
regionMatches -> return a boolean if, defined sub-regions are matched

string manipulation methods
indent -> add or removes spaces from the beginning of lines in multi-line text
strip, stripLeading, stripTrailing, trim
-> the differences between the strip method and trim method is that the strip() supports a larger set of white space character
toLowerCase, toUpperCase -> return new String, either in a lower case or in upper case
concat -> similar to the operator for strings, it concetenates text to the String and returns a new String as the result
join -> allows multiple strings to be concatenated together in a single method, specifying a delimiter.
repeat -> returns the String repeated by the number of times specified in the argument
replace, replaceAll, replaceFirst -> these methods replace characters or strings int the string, returning a new string with replacement made
substring, subSequence -> these return a part of the string, its range defined by the start and end index specified

StringBuilder Class -> java provides a mutable class that lets us change its text value

String hello = "hello";
String helloWorld = "Hello" + "World"
String badHello = new String("Hello");

StringBuilder helloBuilder = new StringBuilder("hello");

hello.concat(" world"); return hello (don't change the internals of the existing string object)
helloBuilder.append(" world"); return hello world

string methods create a new object in memory, and return a reference to this new object
stringbuilder methods return a stringbuilder reference, but it's really a self-reference
stringbuilder default capacity is 16, it will extend by themself

delete, deleteCharAt -> you can delete a substring using indices to specify a range, or delete a single character at an index
insert -> insert text a specified position
reverse -> reverse the order of the characters in the sequence
setLength -> can be used to truncate the sequence, or include null sequences to fill out the sequence to that length
*/