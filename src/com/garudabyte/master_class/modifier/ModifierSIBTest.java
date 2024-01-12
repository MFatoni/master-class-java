package com.garudabyte.master_class.modifier;

/**
 * Created by dev on 23/11/2015.
 */
public class ModifierSIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public ModifierSIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
