package com.garudabyte.master_class.oop;

abstract class GeneralizationMammal extends GeneralizationAnimal {

    public GeneralizationMammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + " ");
        System.out.println( speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public abstract class GeneralizationAnimal {

    protected String type;
    private String size;
    private double weight;

    public GeneralizationAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getExplicitType() {
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
