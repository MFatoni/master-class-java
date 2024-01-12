package com.garudabyte.master_class.oop;

public class GeneralizationUpdatedTest {

    public static void main(String[] args) {

        inFlight(new GeneralizationUpdatedJet());

//        com.garudabyte.master_class.oop.OrbitEarth.log("Testing " + new com.garudabyte.master_class.oop.Satellite());

        orbit(new Satellite());
    }

    private static void inFlight(FlightEnabled flier) {

        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    private static void orbit(OrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
