package com.garudabyte.master_class.oop;

public class GeneralizationUpdatedTruck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
}
