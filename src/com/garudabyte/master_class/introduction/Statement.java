package com.garudabyte.master_class.introduction;

public class Statement {
    public static void main(String[] args) {
        int value = 3;
        switch (value){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3: case 4 : case 5:
                System.out.println("3 or 4 or 5");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        switch (value){
            case 1->System.out.println(1);
            case 2->System.out.println(2);
            case 3,4,5->{
                System.out.println("3 or 4 or 5");
            }
            default-> System.out.println("unknown");
        }
        System.out.println(whoAmI("fatoni"));

        int i=0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            if(i==1){
                break;
            }
        }

        i=0;
        while(i<5){
            System.out.println(i);
            i++;
            if(i==2){
                continue;
            }
            if(i==3){
                break;
            }
        }

        i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<5);

        int[] array = {1,2,3,4,5};
        for (int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }

        for (int element: array){
            System.out.println(element);
        }
    }
    public static String whoAmI(String name){
//        traditional switch
//        switch (name){
//            case "fatoni":
//                return "owner";
//        }
//        return "guest";
//        switch expression
        return switch (name){
            case "fatoni"->"owner";
            default -> {
                String message = "guest";
                yield message;
            }
        };
    }
}

/*
valid switch value type
byte, short, int, char
Byte, Short, Integer, Character
String
enum
 */