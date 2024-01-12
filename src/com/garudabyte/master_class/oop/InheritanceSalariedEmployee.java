package com.garudabyte.master_class.oop;

public class InheritanceSalariedEmployee extends InheritanceEmployee{
    private double annualSalary;
    private boolean isRetired;

    public InheritanceSalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retired(){
        terminate("12/12/2025");
        isRetired=true;
    }
}
