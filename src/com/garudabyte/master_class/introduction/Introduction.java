package com.garudabyte.master_class.introduction;

public class Introduction {
    public static void main(String[] args) {
        // sample of statement and declaring statement
        int number;
        // sample of expressions
        number = 5;
        System.out.println(number);
    }
}

/*
Jshell

/list : show all code
/var : show all variable
{} : prevent auto run

sample of keyword : int
sample of operator : + -
variable is stored in memory

primitive datatype

whole number : byte, short, int, long
decimal : float, double
single character : char
boolean : boolean

sample of datatype wrapper class : Byte (8 bits), Short (16 bits), Int (32 bits), Long

underflow situation : if under the min Integer.MIN_VALUE
overflow situation : if pass the max Integer.MAX_VALUE

to improve readability, number can be formatted using _ (1_000_000)

if a number want to be assigned as long, L character must be place at the end of number (100L)
if a number want to be assigned as double, D character should be place at the end of number (100f)
if a number want to be assigned as float, F character should be place at the end of number (100d)
if want double in exponential format , it can be written like this 5e1
if a character want to be assigned as chart, single quotes must be use, 'D', '\u0044', 68

bool naming convention isEligible, hasChildren

init multiple variable at the same time
byte variable1 = 1, variable2 = 2;

casting variable
int variable2 = 250;
byte variable1 = (byte) (variable2/2)

String is not primitive data type, it is a class
string + anything = string

int variable1 = 15+12; (operand operator operand)

naming convention
project name FirstJavaProject
class name NewClass
method name getData
variable name firstVariable

access modifier : public, protected, private
method : collection statement to perform something
*/

