package com.garudabyte.master_class.oop;

public class InheritanceHourlyEmployee extends InheritanceEmployee{
    private double hourlyPayRate;

    public InheritanceHourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay(){
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }
}
