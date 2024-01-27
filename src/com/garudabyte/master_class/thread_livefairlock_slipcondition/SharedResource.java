package com.garudabyte.master_class.thread_livefairlock_slipcondition;

/**
 * Created by timbuchalka on 2/08/2016.
 */
public class SharedResource {

    private Worker owner;

    public SharedResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
