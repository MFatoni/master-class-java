package com.garudabyte.master_class.oop;

public class GeneralizationHorse extends GeneralizationMammal {

    public GeneralizationHorse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {

        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
