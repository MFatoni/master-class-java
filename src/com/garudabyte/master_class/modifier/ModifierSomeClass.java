package com.garudabyte.master_class.modifier;

/**
 * Created by dev on 20/11/2015.
 */
public class ModifierSomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    public ModifierSomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
