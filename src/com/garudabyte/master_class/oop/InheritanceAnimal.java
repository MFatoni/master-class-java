package com.garudabyte.master_class.oop;

public class InheritanceAnimal {
    protected String type;
    private String size;
    private double weight;

    public InheritanceAnimal(){
        
    }

    public InheritanceAnimal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "com.garudabyte.master_class.oop.InheritanceAnimal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type+ " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
