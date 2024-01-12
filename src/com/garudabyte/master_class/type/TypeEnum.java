package com.garudabyte.master_class.type;

public class TypeEnum {
    public static void main(String[] args) {
        TypeEnumDays weekDay = TypeEnumDays.MON;
        System.out.println(weekDay);
        System.out.println(weekDay.name());
        System.out.println(weekDay.ordinal());

        for (TypeEnumTopping topping : TypeEnumTopping.values()){
            System.out.println(topping.name() +" : "+ topping.getPrice());
        }
    }
}
/*
enum
-> special data type that contains predefined constants
-> constant is a variable whose value can't be changed, once it's value has been assigned
 */