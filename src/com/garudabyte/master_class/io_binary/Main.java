package com.garudabyte.master_class.io_binary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

	    Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc = 64;
//        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());

            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}

/*

FileWriter is a Writer. It's about writing text - and it happens to be writing it to a file. It does that by holding a reference to a FileOutputStream, which is created in the FileWriter constructor and passed to the superclass constructor.

FileOutputStream is an OutputStream. It's about writing binary data. If you want to write text to it, you need something to convert that text to binary data - and that's exactly what FileWriter does. Personally I prefer to use FileOutputStream wrapped in an OutputStreamWriter by me to allow me to specify the character encoding (as FileWriter always uses the platform default encoding, annoyingly).

Basically, think of FileWriter is a simple way of letting you write:

Writer writer = new FileWriter("test.txt");
instead of

Writer writer = new OutputStreamWriter(new FileOutputStream("test.txt"));
Except I'd normally recommend using the overload of the OutputStreamWriter constructor that accepts a Charset.

 */
