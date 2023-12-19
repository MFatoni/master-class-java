package com.garudabyte;

import com.garudabyte1.component.Item;
//import com.garudabyte1.first.*;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        com.garudabyte1.component.Item secondItem = new com.garudabyte1.component.Item("Burger");
    }
}

/*
a package is a namespace that organizes a set of related types
in general, a package corresponds to a folder or directory, on the operating system, but this isnt a requirement
the package structure is hierarchical, meaning we can group types in a tree fashion
we can use any legal java identifier for our package names, but common practice has package names as all lower case
*/
