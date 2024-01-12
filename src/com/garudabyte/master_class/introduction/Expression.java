package com.garudabyte.master_class.introduction;

public class Expression {
    public static void main(String[] args) {
        int health = 100;
        if ((health>0)&&(health<20)){
            System.out.println(health);
        }
        calculateVoid(1);
        System.out.println(calculateCallback(1));
        // 3 expression on code above
    }
    public static void calculateVoid(int number){
        System.out.println(number);
    }
    public static int calculateCallback(int number){
        return number;
    }
}

/*
method signature : method name and parameter init
method return value function
method not return value procedure

method overloading : same method name but different parameter
 */