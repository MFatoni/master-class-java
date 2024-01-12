package com.garudabyte.master_class.modifier;

/**
 * Created by dev on 20/11/2015.
 */
public class ModifierStaticTest {
    private static int numInstances = 0;
    private String name;

    public ModifierStaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
