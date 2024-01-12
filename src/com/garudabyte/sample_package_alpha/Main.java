package com.garudabyte.sample_package_alpha;

import com.garudabyte.sample_package_beta.Item;
//import com.garudabyte1.first.*;

public class Main {
    public static void main(String[] args) {
        Item firstItem = new Item("Burger");
        Item secondItem = new Item("Burger");
    }
}

/*
a package is a namespace that organizes a set of related types
in general, a package corresponds to a folder or directory, on the operating system, but this isnt a requirement
the package structure is hierarchical, meaning we can group types in a tree fashion
we can use any legal java identifier for our package names, but common practice has package names as all lower case
*/
