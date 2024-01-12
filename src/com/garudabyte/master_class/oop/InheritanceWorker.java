package com.garudabyte.master_class.oop;

public class InheritanceWorker {
    private String name;
    private String birthDate;
    protected String endDate;

    public InheritanceWorker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "com.garudabyte.master_class.oop.InheritanceWorker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
