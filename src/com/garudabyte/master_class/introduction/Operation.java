package com.garudabyte.master_class.introduction;

public class Operation {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean isReady = false;
        if(isReady == false)
            System.out.println(false);
        else {
            System.out.println(true);
        }
        if(!isReady && true){
            System.out.println(true);
        }
        if(!isReady || isReady){
            System.out.println(true);
        }
        boolean isExist = true == true ? true : false;
        System.out.println(isExist);
    }
}

/*
equality operator ==
precedence
 */
